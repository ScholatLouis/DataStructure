public class solution_008 {
    public static void main(String[] args) {}

    public static int myAtoi(String str) {
        if(str == null || str.length() == 0)
            return 0;
        int firstNoSpaceIndex = 0;
        while(str.charAt(firstNoSpaceIndex) == 32)
            ++firstNoSpaceIndex;
        // valid
        if(str.charAt(firstNoSpaceIndex) != '+' ||
            str.charAt(firstNoSpaceIndex) != '-' ||
            str.charAt(firstNoSpaceIndex) > '9' ||
            str.charAt(firstNoSpaceIndex) < '0') 
            return 0;
        // sign
        boolean negative = false;
        if(str.charAt(firstNoSpaceIndex) == '+' ||
            str.charAt(firstNoSpaceIndex) == '-')
            negative = str.charAt(firstNoSpaceIndex++) == '+' ? false : true;
        
        return 0;
    }
}