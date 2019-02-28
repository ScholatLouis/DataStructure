public class solution_12 {
    public static void main(String[] args) {
        int num = 999;
        System.out.println(integerToRoman(num));
    }

    public static String integerToRoman(int num) {
        if(num == 0)
            return "";
        String[] roman = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        while(num > 0) {
            while(num >= value[i]) {
                stringBuffer.append(roman[i]);
                num -= value[i];
            }
            ++i;
        }
        return stringBuffer.toString();
    }

    // 空间换时间
    public static String integerToRoman2(int num) {
        final String digit[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		final String ten[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		final String hundred[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        final String thousand[] = { "", "M", "MM", "MMM" };
        StringBuffer string = new StringBuffer();
        string.append(thousand[num/1000]).append(hundred[num%1000/100]).append(ten[num%100/10]).append(digit[num%10/10]);
        return string.toString();
    }
}