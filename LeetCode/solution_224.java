public class solution_224 {
    public static void main(String[] args) {}

    public int calculator(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int sum = 0;
        int sign = 1;
        int number = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(sum);
                stack.push(sign);
                sign = 1;
                sum = 0;
            } else if(Character.isDigit(c)) {
                number = 10 * number + (c - '0');
            } else if(c == '+') {
                sum += sign * number;
                sign = 1;
                number = 0;
            } else if(c == '-') {
                sum += sign * number;
                sign = -1;
                number = 0;
            } else if(c == ')') {
                sum += sign * number;
                number = 0;
                sum *= stack.pop();
                sum += stack.pop();
            }
        }
        // 处理(1+2)+3+4 括号后的情况
        if(number != 0) {
            sum += sign * number;
        }
        return sum;
    }
}