public class solutino_111 {
    public static void main(String[] args) {

    }

    public static int minDepth(TreeNode root) {
        if(root == null) return 0;
        int depth = 0;
        TreeNode currentNode = root;
        int minDepth = Integer.MAX_VALUE;
        Stack<Integer> value = new Stack<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(currentNode != null || !stack.empty()) {
            if(currentNode != null) {
                value.push(++depth);
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode node = stack.pop();
                depth = value.pop();
                if(node.left == null && node.right == null) {
                    minDepth = Math.min(depth, minDepth);
                }
                currentNode = node.right;
            }
        }
        return minDepth;
    }

    public static int minDepth2(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0 || right == 0)
            return left + right + 1;
        return Math.min(left, right) + 1;
    }
}