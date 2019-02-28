import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;

public class solution_102 {
    public static void main(String[] args) {

    }

    public static List<Integer> levelOrder(TreeNode tree) {
        List<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        TreeNode currentNode = tree;
        queue.add(currentNode);
        while(!queue.isEmpty()) {
            currentNode = queue.remove();
            list.add(currentNode.val);
            if(currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if(currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return list;
    }

    public static List<List<Integer>> leverOrder(TreeNode root) {
        List<List<Integer>> wrap = new ArrayList<List<Integer>>();
        if(root == null) return wrap;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        TreeNode currentNode = root;
        queue.add(currentNode);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelList = new ArrayList<Integer>();
            for(int i = 0; i < size; ++i) {
                currentNode = queue.remove();
                levelList.add(currentNode.val);
                if(currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            wrap.add(levelList);
        }
        return wrap;
    }
}