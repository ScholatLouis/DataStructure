public class solution_242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        int[] cnt = new int[26];
        for(int i = 0; i < s.length(); ++i)
            cnt[s.charAt(i) - 'a']++;
        for(int i = 0; i < t.length(); ++i)
            cnt[t.charAt(i) - 'a']--;
        for(int i = 0; i < 26; ++i)
            if(cnt[i] != 0)
                return false;
        return true;
    }
}