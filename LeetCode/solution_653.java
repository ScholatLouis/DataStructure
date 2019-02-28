import java.util.List;

public class solution_653 {

    private static List<Integer> arr = new ArrayList<Integer>();
    public static void main(String[] args) {

    }

    public static boolean findTarget(TreeNode root, int target) {
        List<Integer> sorted = inOrderTraversal(root);
        int low = 0, high = sorted.size() - 1;
        while(low < high) {
            int sum = sorted.get(low) + sorted.get(high);
            if(sum == target)
                return true;
            if(sum > target) --high;
            else ++low;
        }
        return false;
    }

    public static List<Integer> inOrderTraversal(TreeNode root) {
        if(root == null) return arr;
        inOrderTraversal(root.left);
        arr.add(root.val);
        inOrderTraversal(root.right);
        return arr; 
    }
}