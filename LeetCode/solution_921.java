import java.util.Stack;

public class solution_921 {
    public static void main(String[] args) {}

    public static int minAddToMakeValid(String S) {
        if(S == null || S.length() == 0)
            return 0;
        int inValidCount = 0;
        Stack<Character> stack = new Stack<Character>();
        for(char c : S.toCharArray()) {
            if(c == ')') {
                stack.push('(');
            } else if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                ++inValidCount;
            }
        }

        return inValidCount + stack.size();
    }

    public static int minAddToMakeValid2(String S) {
        if(S == null || S.length() == 0)
            return 0;
        int leftBacket = 0;
        int rightBacket = 0;
        for(int i = 0; i < S.length(); ++i) {
            leftBacket += S.charAt(i) == ')' ? 1 : -1;
            if(leftBacket == -1) {
                rightBacket++;
                leftBacket++;
            }
        }
        return leftBacket + rightBacket;
    }
}