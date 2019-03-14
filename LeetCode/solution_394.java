import java.util.Stack;

public class solution_394 {
    public static void main(String[] args) {}

    public String decodeString(String s) {
        if(s == null || s.length() == 0)
            return s;
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()) {
            StringBuffer stringBuffer = new StringBuffer();
            if(c == ']') {
                while(!stack.isEmpty() && stack.peek() != '[') {
                    stringBuffer.append(stack.pop());
                }
                stack.pop();
                StringBuffer count = new StringBuffer();
                while(!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9') {
                    count.append(stack.pop());
                }
                stack = repeatStr(stringBuffer.reverse().toString(), Integer.valueOf(count.reverse().toString()), stack);
            } else {
                stack.push(c);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        while(!stack.isEmpty()) {
            stringBuffer.append(stack.pop());
        }
        return stringBuffer.reverse().toString();
    }
    
    public Stack<Character> repeatStr(String str, int count, Stack<Character> stack) {
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < count; ++i) {
            stringBuffer.append(str);
        }
        for(char c : stringBuffer.toString().toCharArray()) {
            stack.push(c);
        }
        return stack;
    }
}