public class solution_367 {
    public static void main(String[] args) {}
    
    public boolean isPerfectSquare(int num) {
        if(num <= 0)
            return false;
        long start = 0;
        long end = num;
        while(start <= end) {
            long mid = start + (end - start) / 2;
            if(mid * mid == num)
                return true;
            if(mid * mid > num)
                end = mid - 1;
            if(mid * mid < num)
                start = mid + 1;
        }
        return false;
    }
}