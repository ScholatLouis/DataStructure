public class solution_110 {
    public static void main(String[] args) {

    }

    public static boolean isBinaryTree(TreeNode tree) {
        if(tree == null) return true;
        int left = treeDepth(tree.left);
        int right = treeDepth(tree.right);
        if(Math.abs(left - right) > 1)
            return false;
        return isBinaryTree(tree.left) && isBinaryTree(tree.right);
    }

    public static int treeDepth(TreeNode tree) {
        if(tree == null) return 0;
        int left = treeDepth(tree.left);
        int right = treeDepth(tree.right);
        return left > right ? left + 1 : right + 1;
    }

    public static boolean isBinaryTree2(TreeNode tree) {
        if(tree == null) return true;
        int left = treeDepthWithStack(tree.left);
        int right = treeDepthWithStack(tree.right);
        if(Math.abs(left - right) > 1) 
            return false;
        return isBinaryTree(tree.left) && isBinaryTree(tree.right);
    }

    public static int treeDepthWithStack(TreeNode tree) {
        if(tree == null) return 0;
        int depth = 0;
        int maxDepth = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> value = new Stack<Integer>();
        TreeNode currentNode = tree;
        while(currentNode != null || !stack.isEmpty()) {
            if(currentNode != null) {
                stack.push(currentNode);
                value.push(++depth);
                currentNode = currentNode.left;
            } else {
                TreeNode node = stack.pop();
                depth = value.pop();
                maxDepth = Math.max(maxDepth, depth);
                currentNode = node.right;
            }
        }
        return maxDepth;
    }
}