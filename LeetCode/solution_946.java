import java.util.Stack;

public class solution_946 {
    public static void main(String[] args) {}

    public static boolean valideStackSequence(int[] pushed, int[] popped) {
        if(pushed == null && popped == null)
            return true;
        Stack<Integer> stack = new Stack<Integer>();
        int popCount = 0;
        for(int i = 0; i < pushed.length; ++i) {
            stack.push(pushed[i]);
            while(!stack.isEmpty() && stack.peek() == popped[popCount]) {
                stack.pop();
                ++popCount;
            }
        }
        return stack.isEmpty() && popCount == popped.length;
    }
}