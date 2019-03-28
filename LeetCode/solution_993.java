public class solution_993 {
    public static void main(String[] args) {}

    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null)
            return false;

        Queue<TreeNode> queue = new ArrayDequeu<TreeNode>();
        queue.add(root);
        int depth = 0;
        int leftDepth = 0;
        int rightDepth = 0;
        int leftParentVal = 0;
        int rightParentVal = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; ++i) {
                TreeNode treeNode = queue.poll();
                if(treeNode.left != null) {
                    queue.add(treeNode.left);
                    if(treeNode.left.val == x) {
                        leftDepth = depth;
                        leftParentVal = treeNode.val;
                    }
                }
                if(treeNode.right != null) {
                    queue.add(treeNode.right);
                    if(treeNode.right.val == y) {
                        rightDepth = depth;
                        rightParentVal = treeNode.val;
                    }
                }
            }
        }
        return (leftDepth == rightDepth) && (leftParentVal != rightParentVal);
    }
}