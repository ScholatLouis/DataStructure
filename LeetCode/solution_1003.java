import java.util.Stack;

public class solution_1003 {
    public static void main(String[] args) {}

    public static boolean isValid(String S) {
        if(S == null || S.length() == 0)
            return false;
        while(S.indexOf("abc") != -1) {
            S = S.replace("abc", "");
        }
        return S.length() == 0;
    }

    public static boolean isValid2(String S) {
        if(S == null || S.length() == 0)
            return false;
        Stack<Character> stack = new Stack<Character>();
        for(char c : S.toCharArray()) {
            if(c == 'c') {
                if(stack.isEmpty() || stack.pop() != 'b')
                    return false;
                if(stack.isEmpty() || stack.pop() != 'a')
                    return false;
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}