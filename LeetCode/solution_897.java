import java.util.Stack;

public class solution_897 {
    public static void main(String[] args) {}

    public TreeNode increasingBST(TreeNode root) {
        if(root == null)
            return null;
        TreeNode head = new TreeNode(0);
        TreeNode fence = head;
        TreeNode currentNode = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(!stack.isEmpty() || currentNode != null) {
            if(currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode node = stack.pop();
                fence.left = null;
                fence.right = node;
                fence = fence.right;
                currentNode = node.right;
            }
        }
        fence.left = null;
        fence.right = null;
        return head.right;
    }
}