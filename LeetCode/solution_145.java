import java.util.List;
import java.util.LinkedList;

public class solution_145 {
    private static List<Integer> postOrderArr = new ArrayList<Integer>();
    public static void main(String[] args) {

    }

    public static List<Integer> postOrderTraversal(TreeNode root) {
        if(root == null) 
            return postOrderArr;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        postOrderArr.add(root.val);
        return postOrderArr;
    }

    public static List<Integer> postOrderTraversal2(TreeNode root) {
        LinkedList<Integer> postOrderArr = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null)
            return postOrderArr;
        TreeNode currentNode = root;
        while(currentNode != null && !stack.empty()) {
            if(currentNode != null) {
                stack.push(currentNode);
                postOrderArr.addFirst(currentNode.val);
                currentNode = currentNode.right;
            } else {
                TreeNode node = stack.pop();
                currentNode = node.left;
            }
        }
        return root;
    }
}