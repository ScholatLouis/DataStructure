import java.util.Stack;
import java.util.ArrayList;

public class solution_682 {
    public static void main(String[] args) {
        String[] ops = new String[]{"5","-2","4","C","D","9","+","+"};
        solution_682 solution = new solution_682();
        solution.calPoints(ops);
    }

    // 建议在一开始久即将ops[i]转换成integer 用Integer.valueOf(ops[i])
    public int calPoints(String[] ops) {
        int sum = 0;
        Stack<String> pointer = new Stack<String>();
        for(int i = 0; i < ops.length; ++i) {
            if(ops[i].equals("C")) {
                pointer.pop();
            } else if(ops[i].equals("D")) {
                String temp = pointer.peek();
                pointer.push((Integer.parseInt(temp) * 2) + "");
            } else if(ops[i].equals("+")) {
                String first = pointer.pop();
                String second = pointer.peek();
                pointer.push(second);
                pointer.push(first);
                pointer.push((Integer.parseInt(first) + Integer.parseInt(second)) + "");
            } else {
                pointer.push(ops[i]);
            }
            System.out.println(pointer.toString());
        }
        while (!pointer.empty()) {
            // System.out.print(pointer.pop() + " ");   
            sum += Integer.parseInt(pointer.pop());
        }
        System.out.println(sum);
        return sum;
    }
}