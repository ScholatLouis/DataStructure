public class solution_104 {
    public static void main(String[] args) {

    }

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static int maxDepthWithStack(TreeNode root) {
        if(root == null) return 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> value = new Stack<Integer>();
        TreeNode currentNode = root;
        int depth = 0;
        int maxDepth = 0;
        while(currentNode != null || !stack.empty()) {
            if(currentNode != null) {
                stack.push(currentNode);
                value.push(++depth);
                currentNode = currentNode.left;
            } else {
                TreeNode node = stack.pop();
                depth = Integer.valueOf(value.pop());
                maxDepth = Math.max(depth, maxDepth);
                currentNode = node.right;
            }
        }
        System.out.println(depth);
        return maxDepth;
    }
}