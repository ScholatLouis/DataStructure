import java.util.Stack;

public class solution_503 {
    public static void main(String[] args) {}

    public static int[] nextGreaterElements(int[] nums) {
        if(nums == null || nums.length == 0)
            return nums;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        ans = dealWithStack(stack, nums, ans);
        ans = dealWithStack(stack, nums, ans);
        return ans;
    }

    public static int[] dealWithStack(Stack<Integer> stack, int[] nums, int[] ans) {
        for(int i = nums.length - 1; i >= 0; --i) {
            while(!stack.isEmpty() && stack.peek() <= nums[i])
                stack.pop();
            if(!stack.isEmpty() && stack.peek() > nums[i])
                ans[i] = stack.peek();
            else 
                ans[i] = -1;
            stack.push(nums[i]);
        }
        return ans;
    }
}