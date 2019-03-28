import java.util.Queue;
import java.util.List;
import java.util.ArrayDeque;

public class solution_559 {
    public static void main(String[] args) {}

    public int maxDepth(Node root) {
        if(root == null)
            return 0;

        int maxPath = 0;
        Queue<Node> queue = new ArrayDeque<Node>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            ++maxPath;
            for(int i = 0; i < size; ++i) {
                Node node = queue.poll();
                List<Node> children = node.children;
                for(Node child : children) 
                    queue.add(child);
            }
        }

        return maxPath;
    }

}