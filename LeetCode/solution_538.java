public class solution_538 {
    private static int sum = 0;
    public static void main(String[] args) {

    }

    public static TreeNode convertBST(TreeNode root) {
        if(root == null) return null;
        travel(root);
        return root;
    }

    public static void travel(TreeNode root) {
        if(root == null) return ;
        travel(root.right);
        sum += root.val;
        root.val = sum;
        travel(root.left);
    }

    public static TreeNode travelByStack(TreeNode root) {
        if(root == null) return null;
        int sum = 0;
        TreeNode currentNode = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(currentNode != null || !stack.empty()) {
            if(currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.right;
            } else {
                TreeNode node = stack.pop();
                sum += node.val;
                node.val = sum;
                currentNode = node.left;
            }
        }
        return root;
    }
}