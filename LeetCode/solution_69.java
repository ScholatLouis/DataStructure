public class solution_69 {
    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(Integer.MAX_VALUE);
        mySqrt(x);
    }

    public static int mySqrt(int x) {
        // 这里不能用int类型，会溢出
        if(x <= 1) 
            return x;
        long low = 1;
        long high = x;
        while(low <= high) {
            long mid = low + (high - low) / 2;
            if(mid * mid < x) 
                low = mid + 1;
            if(mid * mid > x)
                high = mid - 1;
            if(mid * mid == x) {
                return (int)mid;
            }
        }
        return (int)high;
    }
}