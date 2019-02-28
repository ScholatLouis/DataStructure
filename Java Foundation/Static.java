import java.util.Date;

public class Static {
    static String s = "";

    static {
        System.out.println("This is the static code block");
        s = "this is the variable";
        System.out.println(s);
    }

    public static void main(String args[]) {
        System.out.println(new Date().getTime());
        Static temp = new Static();
        System.out.println();
        System.out.println(temp.Fibonacci(6));
    }

    // 斐波那契数列Fibonacci Array
    public int Fibonacci(int n) {
        // F(n) = F(n-1) + F(n-2)
        if(n == 0 || n == 1) {
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}