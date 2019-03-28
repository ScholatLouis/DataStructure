public class solution_429 {
    public static void main(String[] args) {}

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> levelList = new ArrayList<List<Integer>>();
        if(root == null)
            return levelList;
        Queue<Node> queue = new ArrayDeque<Node>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < size; ++i) {
                Node node = queue.poll();
                list.add(node.val);
                for(Node child : node.children) {
                    queue.add(child);
                }
            }
            levelList.add(list);
        }
        return levelList;
    }
}