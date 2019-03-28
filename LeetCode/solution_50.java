public class solution_50 {
    public static void main(String[] args) {}

    public static double myPow(int x, int n) {
        return Math.pow(x, n);
    }

    public static double myPow2(int x, int n) {
        double result = 1;
        for(int i = 0; i < n; ++i) {
            result *= x;
        }
        return result;
    }

    public static double myPow3(int x, int n) {
        
    }
}