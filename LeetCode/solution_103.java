import java.util.List;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class solution_103 {
    public static void main(String[] args) {}

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> levelList = new ArrayList<List<Integer>>();
        if(root == null)
            return levelList;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean reverseFlag = false;
        while(!queue.isEmpty()) {
            int size = queue.size();
            TreeNode curTreeNode = queue.poll();
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < size; ++i) {
                if(curTreeNode.left != null)
                    queue.add(curTreeNode.left);
                if(curTreeNode.right != null)
                    queue.add(curTreeNode.right);
                if(reverseFlag)
                    list.add(0, curTreeNode.val);
                else 
                    list.add(curTreeNode.val);
            }
            reverseFlag = !reverseFlag;
            levelList.add(list);
        }
        return levelList;
    }
}