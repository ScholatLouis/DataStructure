import java.util.Queue;

public class solution_226 {
    public static void main(String[] args) {

    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode left = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(left);
        return root;
    }

    public static TreeNode invertTree2(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode fence = queue.remove();
            TreeNode temp = fence.left;
            fence.left = fence.right;
            fence.right = temp;
            if(fence.left != null)
                queue.add(fence.left);
            if(fence.right != null)
                queue.add(fence.right);
        }
        return root;
    }
}