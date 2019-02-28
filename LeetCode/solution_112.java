import java.util.Queue;

public class solution_112 {
    public static void main(String[] args) {

    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.left == null && root.right == null && root.val == sum)
            return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public static boolean hasPathSumWithQueue(TreeNode root, int sum) {
        if(root == null)
            return false;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode fence = queue.poll();
            if(fence.left == null && fence.right == null && fence.val == sum)
                return true;
            if(fence.left != null) {
                fence.left.val = sum - fence.val;
                queue.add(fence.left);
            }
            if(fence.right != null) {
                fence.right.val = sum - fence.val;
                queue.add(fence.right);
            }
        }
        return false;
    }
}