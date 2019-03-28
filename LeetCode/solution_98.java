import java.util.Stack;

public class solution_98 {
    public static void main(String[] args) {}

    public boolean validBST(TreeNode root) {
        if(root == null)
            return true;
        TreeNode currentNode = root;
        TreeNode prevNode = null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(!stack.isEmpty() || currentNode != null) {
            if(currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode node = stack.pop();
                if(prevNode != null && prevNode.val >= node.val) {
                    return false;
                }
                prevNode = node;
                currentNode = node.right;
            }
        }
        return true;
    }
}