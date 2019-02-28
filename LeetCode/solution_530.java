public class solution_530 {
    private static int mix = Integer.MAX_VALUE;
    private static int preVal = Integer.MAX_VALUE;
    public static void main(String[] args) {

    }

    public static int getMinimumDifference(TreeNode root) {
        if(root == null) return 0;
        inOrderTraversalIncursion(root);
        return mix;
    }

    public static void inOrderTraversalIncursion(TreeNode root) {
        if(root == null) return ;
        inOrderTraversalIncursion(root.left);
        if(preVal != Interger.MAX_VALUE) 
            mix = Math.min(mix, Math.abs(root.val - mix));
        preVal = root.val;
        inOrderTraversalIncursion(root.right);
    }

    public static int inOrderTraversal(TreeNode root) {
        if(root == null) return 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        int min = Integer.MAX_VALUE;
        TreeNode currentNode = root;
        TreeNode preNode = null;
        while(currentNode != null || !stack.empty()) {
            if(currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode node = stack.pop();
                if(preNode != null) 
                    min = Math.min(min, Math.abs(node.val - preNode.val));
                preNode = node;
                currentNode = node.right;
            }
        }
        return min;
    }
}