public class solution_559 {
    public static void main(String[] args) {

    }

    public int maxDepth(Node root) {
        if(root == null) return 0;

    }

    public void inOrderTraval(Node root) {
        if(root.children) {
            for(Node item : root.children) 
                inOrderTraval(root.children);
        }
        System.out.println(root.val);
    }

}