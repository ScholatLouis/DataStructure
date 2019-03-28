public class solution_669 {
    public static void main(String[] args) {

    }

    // key point: 
    // 当root.val > min 整个root的right都大于min
    // 当root.val < max 整个root的left都小于max
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null)
            return root;
        // Find the valid node to return as a root
        // root.val must between L and R
        while(root != null && (root.val < L || root.val > R)) {
            if(root.val < L) {
                root = root.right;
            } else if (root.val > R) {
                root = root.left;
            }
        }

        TreeNode dummy = root;
        while(dummy != null) {
            while(dummy.left != null && dummy.left.val < L) {
                dummy.left = dummy.left.right;
            }
            dummy = dummy.left;
        }

        dummy = root;
        while(dummy != null) {
            while(dummy.right != null && dummy.right.val > R) {
                dummy.right = dummy.right.right;
            }
            dummy = dummy.right;
        }
        return root;
    }
}