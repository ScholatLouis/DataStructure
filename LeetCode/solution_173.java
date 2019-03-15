import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;

public class solution_173 {
    public static void main(String[] args) {}

    private static Stack<TreeNode> stack = new Stack<TreeNode>();
    private static Queue<TreeNode> queue = new ArrayDeque<TreeNode>();

    public static void BSTIterator(TreeNode root) {
        if(root == null)
            return ;
        TreeNode currentNode = root;
        while(!stack.isEmpty() || currentNode != null) {
            if(currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode node = stack.pop();
                queue.add(node);
                currentNode = node.right;
            }
        }
    }

    public static int next() {
        TreeNode node = null;
        if(!queue.isEmpty()) {
            node = queue.poll();
            return node.val;
        } else {
            return -1;
        }
    }

    public static boolean hasNext() {
        return !queue.isEmpty();
    }
}