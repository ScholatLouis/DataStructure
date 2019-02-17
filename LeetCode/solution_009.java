import java.util.List;
import java.util.ArrayList;

public class solution_009 {
    public static void main(String[] args) {
        int x = 123321;
        isPalindrome2(x);
    }

    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int target = x;
        List<Integer> bitList = new ArrayList<Integer>();
        while(target > 0) {
            bitList.add(target % 10);
            target = target / 10;
        }
        int count = 1;
        int palindrome = 0;
        for(int i = bitList.size() - 1; i >= 0; --i) {
            palindrome += bitList.get(i) * count;
            count = count * 10;
        }
        System.out.println(palindrome);
        return palindrome == x;
    }

    public static boolean isPalindrome2(int x) {
        if(x < 0) 
            return false;
        int target = x;
        int palindrome = 0;
        while(target > 0) {
            palindrome = palindrome * 10 + target % 10;
            target /= 10;
        }
        System.out.println(palindrome);
        return palindrome == x;
    }

    public static boolean isPalindrome3(int x) {
        if(x < 0)
            return false;
        int palindrome = 0;
        while(x > palindrome) {
            palindrome = palindrome * 10 + x % 10;
            x /= 10;
        }
        return palindrome == x || palindrome / 10 == x;
    }
}