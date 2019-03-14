import java.util.Stack;

public class solution_844 {
    public static void main(String[] args) {
        solution_844 solution = new solution_844();
        String S = "a##c";
        String T = "#a#c";
        solution.backspaceComapre(S, T);
    }

    public boolean backspaceComapre(String S, String T) {
        Stack<Character> sstr = new Stack<>();
        Stack<Character> tstr = new Stack<>();
        for(char c : S.toCharArray()) {
            if(c == '#') {
                if(!sstr.isEmpty()) {
                    sstr.pop();
                }
            } else {
                sstr.push(c);
            }
        }

        for(char c : T.toCharArray()) {
            // System.out.println(c == '#');
            if(c == '#') {
                if(!tstr.isEmpty()) {
                    tstr.pop();
                }
            } else {
                tstr.push(c);
            }
        }
        System.out.println(sstr.toString());
        System.out.println(tstr.toString());
        return sstr.toString().equals(tstr.toString());
    }
}