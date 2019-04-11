public class solution_227 {
    public static void main(String[] args) {}

    public int calculate(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int sum = 0;
        int number = 0;
        char sign = '+';
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            }
            if(!Character.isDigit(c) && c != ' '|| i == s.length() - 1) {
                if(sign == '+') {
                    stack.push(number);
                } else if(sign == '-') {
                    stack.push(-number);
                } else if(sign == '*') {
                    stack.push(stack.pop() * number);
                } else if(sign == '/') {
                    stack.push(stack.pop() / number);
                }
                sign = c;
                number = 0;
            }
        }

        while(stack.size() > 0) {
            sum += stack.pop();
        }
        return sum;
    }
}