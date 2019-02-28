import java.awt.List;

public class solution_501 {
    private static int cnt = 0;
    private static int maxCount = 0;
    private static List<Integer> list = new ArrayList<Integer>();
    private static TreeNode preNode = null;
    public static void main(String[] args) {

    }

    public static int[] findMode(TreeNode root) {
        inOrder(root);
        int[] arr = new int[list.size()];
        int index = 0;
        for(int num : list) {
            arr[index++] = num;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void inOrder(TreeNode root) {
        if(root == null) return;
        inOrder(root.left);
        if(preNode != null && preNode.val == root.val) {
            ++cnt;
        } else {
            cnt = 1;
        }
        if(cnt > maxCount) {
            maxCount = cnt;
            list.clear();
            list.add(root.val);
        } else if(cnt == maxCount) {
            list.add(root.val);
        }
        preNode = root;
        inOrder(root.right);
    }

    public static void inOrderWithStack(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode currentNode = root;
        while(currentNode != null || !stack.empty()) {
            if(currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode node = stack.pop();
                if(preNode != null && preNode.val == node.val)
                    ++cnt;
                else
                    cnt = 1;
                if(cnt > maxCount) {
                    maxCount = cnt;
                    list.clear();
                    list.add(node.val);
                } else if(cnt == maxCount) {
                    list.add(node.val);
                }
                preNode = node;
                currentNode = node.right;
            }
        }
    }
}