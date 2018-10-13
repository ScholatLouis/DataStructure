public class solution_700 {
    public static void main(String[] args) {
        solution_700 solution = new solution_700();
        solution.generateBST();
    }

    public void generateBST() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        inOrderVisited(root);
        searchBST(root, 2);
    }

    public void inOrderVisited(TreeNode root) {
        if(root != null) {
            inOrderVisited(root.left);
            System.out.println(root.val);
            inOrderVisited(root.right);
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;
        if(root.val == val) {
            System.out.println(val);
            inOrderVisited(root);
            return root;
        } else {
            return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
        }
    }
}