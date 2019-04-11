public class solution_1021 {
    public static void main(String[] args) {}

    public String removeOuterParentheses(String s) {
        if(s == null || s.length() == 0)
            return s;
        int operationCount = 0;
        StringBuffer stringBuffer = new StringBuffer();
        for(char c : s.toCharArray()) {
            if(c == '(' && operationCount++ > 0)
                stringBuffer.append(c);
            if(c == ')' && operationCount-- > 1)
                stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }
}