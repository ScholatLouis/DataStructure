import java.util.ArrayList;
import java.util.List;

public class solution_005 {
    public static void main(String[] args) {
        String s = "cabadabae";
        System.out.println(longestPalindrome2(s));
    }

    // brute force
    public static String longestPalindrome(String s) {
        if(s == null || s.length() <= 1)
            return s;
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < s.length(); ++i) {
            for(int j = i + 1; j <= s.length(); ++j) {
                list.add(s.substring(i, j));
            }
        }
        int maxLength = 0;
        String maxStr = "";
        for(String str : list) {
            // System.out.println(str);
            if(isPalindrome(str)) {
                maxStr = str.length() > maxLength ? str : maxStr;
                maxLength = Math.max(maxLength, str.length());
            }
        }
        return maxStr;
    }

    // expand aroud center
    public static String longestPalindrome2(String s) {
        if(s == null || s.length() <= 1)
            return s;
        int length = 0;
        int maxLength = 0;
        String maxStr = "";
        int start, end;
        for(int i = 0; i < s.length(); ++i) {
            // try odd 
            end = i;
            start = i;
            length = 1;
            while(start-1 >= 0 && end+1 < s.length() && s.charAt(start-1) == s.charAt(end+1)) {
                end += 1;
                start -= 1;
                length +=2;
            }
            if(length >= maxLength) {
                maxLength = length;
                System.out.println("odd: " + start + " " + end + " " + i + " " + maxStr + " " + maxLength);
                maxStr = s.substring(start, end+1);
            }
        }
        for(int i = 0; i < s.length(); ++i) {
            if(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)) {
                // try even
                start = i;
                length = 2;
                end = i + 1;
                while(start-1 >= 0 && end+1 < s.length() && s.charAt(start-1) == s.charAt(end+1)) {
                    end += 1;
                    start -= 1;
                    length += 2;
                }
                if(length >= maxLength) {
                    maxLength = length;
                    System.out.println(start + " " + end + " " + i + " " + maxStr);
                    maxStr = s.substring(start, end+1);
                }
            }
        }
        System.out.println(maxStr);
        return maxStr;
    }

    public static boolean isPalindrome(String str) {
        if(str == null || str.length() == 0)
            return true;
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString().equals(str);
    }
}