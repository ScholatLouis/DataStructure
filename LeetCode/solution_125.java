public class solution_125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        validPalindrome(s);
    }

    public static boolean validPalindrome(String s) {
        char[] charArr = s.toCharArray();
        String first = "";
        for(int i = 0; i < charArr.length; ++i) {
            if(Character.isLetterOrDigit(charArr[i])) {
                first += Character.toLowerCase(charArr[i]);
            }
        }
        String second = "";
        for(int i = charArr.length - 1; i >= 0; --i) {
            if(Character.isLetterOrDigit(charArr[i])) {
                second += Character.toLowerCase(charArr[i]);
            }
        }
        System.out.println(first + " | " + second);
        System.out.println(first.equals(second));
        return first.equals(second);
    }

    public static boolean validPalindrome2(String s) {
        if(s.isEmpty()) 
            return true;
        int head = 0;
        int tail = s.length() - 1;
        char charHead, charTail;
        while(head <= tail) {
            charHead = s.charAt(head);
            charTail = s.charAt(tail);
            if(!Character.isLetterOrDigit(charHead)) {
                ++head;
            } else if(!Character.isLetterOrDigit(charTail)) {
                --tail;
            } else {
                if(Character.toLowerCase(charHead) != Character.toLowerCase(charTail)) {
                    System.out.println(false);
                    return false;
                }
                ++head;
                --tail;
            }
        }
        System.out.println(true);
        return true;
    }
}