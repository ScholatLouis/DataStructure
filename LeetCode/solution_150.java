import java.util.Stack;

public class solution_150 {
    public static void main(String[] args) {
        String[] tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        evalRPN(tokens);
    }

    public static int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length == 0) 
            return 0;
        int sum = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(String s : tokens) {
            switch(s) {
                case "+":
                    sum = stack.pop() + stack.pop();
                    stack.push(sum);
                    break;
                case "-":
                    sum = stack.pop() - stack.pop();
                    stack.push(sum);
                    break;
                case "*":
                    sum = stack.pop() * stack.pop();
                    stack.push(sum);
                    break;
                case "/":
                    sum = stack.pop() / stack.pop();
                    stack.push(sum);
                    break;
                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
        }
        System.out.println(sum);
        return sum;
    }
}