import java.util.List;

public class solution_94 {
    private static List<Integer> inOrderArr = new ArrayList<Integer>();
    public static void main(String[] args) {

    }

    public static List<Integer> inOrderTraversal(TreeNode root) {
        if(root == null) 
            return inOrderArr;
        inOrderTraversal(root.left);
        inOrderArr.add(root.val);
        inOrderTraversal(root.right);
        return inOrderArr;
    }

    public static List<Integer> inOrderTraversal2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> inOrderArr = new ArrayList<Integer>();
        if(root == null)
            return inOrderArr;
        TreeNode currentNode = root;
        while(currentNode != null || !stack.empty()) {
            if(currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode node = stack.pop();
                inOrderArr.add(node.val);
                currentNode = node.right;
            }
        }
        return inOrderArr;
    }
}