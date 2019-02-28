public class solution_007 {
    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse2(x));
    }

    public static int reverse(int x) {
        long num = (long)x;
        boolean negative = (num < 0);
        num = negative ? -num : num;
        System.out.println(num + " " + negative);
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(num));
        String reverse = stringBuffer.reverse().toString();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(reverse);
        if( Long.valueOf(reverse) > (long)Integer.MAX_VALUE)
            return 0;
        else 
            return negative ? 0 - Integer.valueOf(reverse) : Integer.valueOf(reverse);
    }

    public static int reverse2(int x) {
        long rev = 0;
        while(x != 0) {
            rev = rev * 10 + x % 10;
            x = x/10;
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        return (int)rev;
    }
}