import java.util.ArrayDeque;
import java.util.Deque;

public class BinaryTree {

    private TreeNode root;

    public class TreeNode {
        private int value;
        private TreeNode leftTree, rightTree;
        public TreeNode(int value) {
            this.value = value;
            this.leftTree = this.rightTree = null;
        }
    }

    public void addNode(TreeNode root, int value) {
        if(root == null) {
            root.value = value;
            root.leftTree = null;
            root.rightTree = null;
        } else {
            addNode(root.leftTree, value);
        }
    }

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.add(10);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peekLast());
    }
}