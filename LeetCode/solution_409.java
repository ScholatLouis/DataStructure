import java.util.Arrays;

public class solution_409 {
    public static void main(String[] args) {
        String s = "bananas";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int[] letter = new int[58];
        for(char c : s.toCharArray()) {
            letter[c - 'A']++;
        }
        System.out.println(Arrays.toString(letter));
        int result = 0;
        for(int i = 0; i < 58; ++i) {
            result += (letter[i] / 2) * 2;
        }
        if(result < s.length())
            result++;
        return result;
    }
}