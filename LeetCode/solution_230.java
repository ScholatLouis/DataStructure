import java.util.List;

public class solution_230 {
    private static List<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {

    }

    public static int kthSmallest(TreeNode root, int k) {
        return list.get(k);
    }

    public static void inOrder(TreeNode root) {
        if(root == null)
            return ;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}