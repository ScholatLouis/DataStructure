public class solution_504 {
    public static void main(String[] args) {
        int num = 7;
        convertToBase72(num);
    }

    public static String convertToBase7(int num) {
        if(num < 7 && num > 0)
            return "" + num;
        boolean negative = false;
        StringBuffer stringBuffer = new StringBuffer();
        if(num < 0) {
            negative = true;
            num = -num;
        }
        while(num != 0) {
            stringBuffer.append(num % 7);
            num = num / 7;
        }
        if(negative)
            stringBuffer.append("-");

        String result = stringBuffer.reverse().toString();
        System.out.println(result);
        return result;
    }

    public static String convertToBase72(int num) {
        return Integer.toString(num, 7);
    }

    // ？？？？ compare with 405
    public static String convertToBase73(int num) {
        if(num == 0) {
            return "0";
        }
        String result = "";
        String[] map = {"0", "1", "2", "3", "4", "5", "6", "7"};
        while(num != 0) {
            result = map[(num & 0b111)] + result;
            num = num / 7;
        }
        System.out.println(result);
        return result;
    }
}