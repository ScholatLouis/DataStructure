public class solution_13 {
    public static void main(String[] args) {
        String s = "IV";
        System.out.println(romanToInteger(s));
    }

    public static int romanToInteger(String s) {
        if(s == null || s.length() == 0)
            return 0;
        // final String numerals[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        // final int values[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        int result = 0;
        for(int i = 0; i < s.length(); ++i) {
            char charCode = s.charAt(i);
            if(charCode == 'M') {
                result += 1000;
            } else if(charCode == 'D') {
                result += 500;
            } else if(charCode == 'L') {
                result += 50;
            } else if(charCode == 'V') {
                result += 5;
            } else if(charCode == 'C') {
                if(i+1 < s.length() && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
                    result -= 100;
                } else {
                    result += 100;
                }
            } else if(charCode == 'X') {
                if(i+1 < s.length() && (s.charAt(i+1) == 'C' || s.charAt(i+1) == 'L')) {
                    result -= 5;
                } else {
                    result += 5;
                }
            } else {
                if(i+1 < s.length() && (s.charAt(i+1) == 'X' || s.charAt(i+1) == 'V')) {
                    result -= 1;
                } else {
                    result += 1;
                }
            }
        }
        return result;
    }
}