public class solution_617 {

    public static int count = -1;

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,0,0,0,2};
        TreeNode tree1 = new TreeNode(0);
        tree1 = generateBinaryTree(nums, tree1);
        System.out.println();
        inOrderVisit(tree1);
        System.out.println();
        preOrderVisit(tree1);
        System.out.println();
        postOrderVisit(tree1);
        System.out.println();
        System.out.println("===========");
        nums = new int[]{2,1,0,4,0,0,3,0,7};
        count = -1;
        TreeNode tree2 = new TreeNode(0);
        tree2 = generateBinaryTree(nums, tree2);
        System.out.println();
        inOrderVisit(tree2);
        System.err.println();
        preOrderVisit(tree2);
        System.out.println();
        postOrderVisit(tree2);
        System.out.println();
        System.out.println("=============");
        TreeNode mergetree = mergeTrees(tree1, tree2);
        inOrderVisit(mergetree);
        System.out.println();
        preOrderVisit(mergetree);
        System.out.println();
        postOrderVisit(mergetree);
        System.out.println();
    }

    public static void postOrderVisit(TreeNode root) {
        if(root != null) {
            postOrderVisit(root.left);
            postOrderVisit(root.right);
            System.out.print(root.val);
        }
    }

    public static void inOrderVisit(TreeNode root) {
        if(root != null) {
            System.out.print(root.val);
            inOrderVisit(root.left);
            inOrderVisit(root.right);
        }
    }

    public static void preOrderVisit(TreeNode root) {
        if(root != null) {
            preOrderVisit(root.left);
            System.out.print(root.val);
            preOrderVisit(root.right);
        }
    }

    public static TreeNode generateBinaryTree(int[] nums, TreeNode root) {
        ++count;
        if(count >= nums.length || nums[count] == 0) {
            return null;
        } else {
            root = new TreeNode(nums[count]);
            root.left = generateBinaryTree(nums, root.left);
            root.right = generateBinaryTree(nums, root.right);
            return root;
        }
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return null;
        if(t1 == null) {
            return t2;
        }

        if(t2 == null) {
            return t1;
        }
        
        TreeNode root = new TreeNode(t1.val + t2.val);
        root.left = mergeTrees(t1.left, t2.left);
        root.right = mergeTrees(t1.right, t2.right);
        return root;
    }

    public static TreeNode mergeTree2(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return null;
        if(t1 == null) return t2;
        if(t2 == null) return t1;
        t1.val = t1.val + t2.val;
        t1.left = mergeTree2(t1.left, t2.left);
        t1.right = mergetTree2(t1.right, t2.right);
        return t1;
    }

    public static TreeNode mergeTreesWithQueue(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null)
            return null;
        return null;
    }

}