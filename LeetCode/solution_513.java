import java.util.ArrayDeque;
import java.util.Queue;

public class solution_513 {
    public static void main(String[] args) {

    }

    public static int findBottomLeftValue(TreeNode root) {
        if(root == null) 
            return 0;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        TreeNode currentNode = root;
        queue.add(currentNode);
        while(!queue.isEmpty()) {
            currentNode = queue.poll();
            if(currentNode.right != null)
                queue.add(currentNode.right);
            if(currentNode.left != null)
                queue.add(currentNode.left);
        }
        return currentNode.val;
    }
}