import java.util.Set;
import java.util.HashSet;

public class solution_003 {
    public static void main(String[] args) {
        solution_003 solution = new solution_003();
        String s = "pwwkew";
        solution.lengthOfLongestSubstring3(s);
    }
    
    // subsequence is not equal to the substring
    // eg: string s = "pwwkew"
    // the longest common subsequence is pwke
    // the longest substring is kew
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        char[] charStr = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < charStr.length; ++i) {
            sb.delete(0, sb.length());
            for(int j = i; j < charStr.length; ++j) {
                if(sb.indexOf(String.valueOf(charStr[j])) != -1) {
                    break;
                }
                sb.append(charStr[j]);
            }
            length = Math.max(length, sb.length());
        }
        System.out.println(length);
        return length;
    }

    // brute force
    public int lengthOfLongestSubstring2(String s) {
        return 0;
    }

    // sliding window 双指针
    public int lengthOfLongestSubstring3(String s) {
        int maxLength = 0;
        int length = s.length();
        Set<Character> set = new HashSet<Character>();
        int start = 0, end = 0;
        while(start < length && end < length) {
            if(!set.contains(s.charAt(end))) {
                set.add(s.charAt(end++));
                maxLength = Math.max(maxLength, end - start);
            } else {
                set.remove(s.charAt(start++));
            }
        }
        System.out.println(set.toString());
        return maxLength;
    }
}