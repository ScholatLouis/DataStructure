public class solution_680 {
    public static void main(String[] args) {
        String s = "abcbea";
        validPalindrome(s);
    }

    public static boolean validPalindrome(String s) {
        if(s.isEmpty()) {
            return true;
        }
        int head = 0, tail = s.length() - 1;
        while(head < tail) {
            if(s.charAt(tail) != s.charAt(head)) {
                return isPalindrome(s, head+1, tail) ||
                    isPalindrome(s, head, tail-1);
            }
            ++head;
            --tail;
        }
        System.out.println("validPalindrome: " + true);
        return true;
    }

    public static boolean isPalindrome(String s, int start, int end) {
        if(s.isEmpty()) 
            return true;
        int head = start, tail = end;
        while(head <= tail) {
            if(Character.toLowerCase(s.charAt(head)) != Character.toLowerCase(s.charAt(tail))) {
                System.out.println("isPalindrome: " + false);
                return false;
            }
            ++head;
            --tail;
        }
        System.out.println("isPalindrome: " + true);
        return true;
    }
}