import java.util.Queue;

public class solution_107 {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> wrap = new ArrayList<List<Integer>>();
        if(root == null) return wrap;
        TreeNode currentNode = root;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(currentNode);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelList = new ArrayList<Integer>();
            for(int i = 0; i < size; ++i) {
                currentNode = queue.remove();
                levelList.add(currentNode.val);
                if(currentNode.left != null)
                    queue.add(currentNode.left);
                if(currentNode.right != null)
                    queue.add(currentNode.right);
            }
            wrap.add(0, levelList);
        }
        return wrap;
    }
}