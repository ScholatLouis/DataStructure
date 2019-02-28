import java.util.Queue;

public class solution_637 {
    public static void main(String[] args) {

    }

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> average = new ArrayList<Double>();
        if(root == null) return average;
        TreeNode currentNode = root;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(currentNode);
        while(!queue.isEmpty()) {
            int size = queue.size();
            // int类型有可能溢出
            long sum = 0;
            for(int i = 0; i < size; ++i) {
                currentNode = queue.remove();
                sum += currentNode.val;
                if(currentNode.left != null)
                    queue.add(currentNode.left);
                if(currentNode.right != null)
                    queue.add(currentNode.right);
            }
            // size 不可能为0 因为queue不为空
            average.add(sum * 1.0 / size);
        }
        return average;
    }
}