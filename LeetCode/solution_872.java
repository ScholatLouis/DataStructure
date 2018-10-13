public class solution_872 {
    public static void main(String[] args) {

    }

    public boolean leftSimilar(TreeNode t1, TreeNode t2) {
        String str1 = "";
        String str2 = "";
        str1 = getLeftNode(t1, str1);
        str2 = getLeftNode(t2, str2);
        return str1.equals(str2);
    }

    public String getLeftNode(TreeNode t, String str) {
        if(t == null) return str;
        if(t.left == null && t.right == null) {
            System.out.println(t.val);
            return str += t.val;
        }
        str = getLeftNode(t.left);
        str = getLeftNode(t.right);
        return str;
    }
}