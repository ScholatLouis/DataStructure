public class solution_965 {
    public static void main(String[] args) {}

    public boolean isUnivalTree(TreeNode root) {
        if(root == null)
            return true;

        int preValue = root.val;
        TreeNode currentNode = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(!stack.isEmpty() || currentNode != null) {
            if(currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode node = stack.pop();
                if(node.val != preValue)
                    return false;
                currentNode = currentNode.right;
            }
        }
        return true;
    }
}