public class solution_371 {
    public static void main(String[] args) {}

    public int getSum(int a, int b) {
        if(a == 0)
            return b;
        if(b == 0)
            return a;
        int carray = 0;
        while( b != 0 ) {
            carray = a & b;
            a = a ^ b;
            b = carray << 1;
        }
        return a;
    }
}