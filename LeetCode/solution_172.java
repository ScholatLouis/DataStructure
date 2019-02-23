public class solution_172 {
    public static void main(String[] args) {
        int n = 5;
        trailingZeroes(n);
    }

    public static int trailingZeroes(int n) {
        int count = 0;
        while(n != 0) {
            count += n/5;
            n = n/5;
        }
        System.out.println(count);
        return count;
    }
}