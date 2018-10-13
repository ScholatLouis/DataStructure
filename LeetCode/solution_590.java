public class solution_590 {
    public int count = 1;
    public List<Integer> postvalue = new ArrayList<Integer>();

    public static void main(String[] args) {

    }

    public Node generateTree(int[] nums, int nAry) {
        // TODO：how to create n-ary tree
    }

    public List<Integer> postorder(Node root) {
        if(root == null) return postvalue;
        if(root.children != null) {
            for(Node node : root.children) {
                postorder(node);
            }
        }
        System.out.print(root.val);
        postvalue.add(root.val);
        return postvalue;
    }
}