public class solution_405 {
    public static void main(String[] args) {
        int num = -1;
        String temp = toHex(num);
        System.out.println(temp);
    }

    public static String convertToHex(int num) {
        return Integer.toString(num, 16);
    }

    public static String convertToHex2(int num) {
        if(num == 0)
            return "0";
        boolean negative = (num < 0);
        StringBuffer stringBuffer = new StringBuffer();
        String[] dictionary = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        while(num != 0) {
            stringBuffer.append(dictionary[Math.abs(num % 16)]);
            num = num / 16;
        }
        if(negative)
            stringBuffer.append("-");
        return stringBuffer.reverse().toString();
    }

    public static String toHex(int num) {
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if(num == 0) return "0";
        String ret = "";
        while(num != 0){
            ret = map[(num & 0b1111)] + ret;
            num >>>= 4;
        }
        return ret;
    }
}