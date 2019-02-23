import java.util.List;
import java.util.ArrayList;

public class solution_144 {
    private static List<Integer> preOrderList = new ArrayList<Integer>();
    public static void main(String[] args) {
    }

    // 递归的方式
    public static int[] preOrderTraversal(TreeNode root) {
        if(root == null) 
            return preOrderList;
        preOrderList.add(root.val);
        preOrderArr(root.left);
        preOrderArr(root.right);
        return preOrderArr;
    }

    // 非递归的方式
    public static List<Integer> preOrderTraversal2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> preOrderList = new ArrayList<Integer>();
        if(root == null) 
            return preOrderList;
        TreeNode currentNode = root;
        while(currentNode != null || !stack.empty()) {
            if(currentNode != null) {
                preOrderList.add(currentNode.val);
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode node = stack.pop();
                currentNode = node.right;
            }
        }
        return preOrderList;
    }
}