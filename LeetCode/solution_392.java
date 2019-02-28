public class solution_392 {
    public static void main(String[] args) {
        Stirng sub = "abc";
        String origin = "acsedbc";
        isSubsequence(sub, origin);
    }

    public static boolean isSubsequence(String sub, String origin) {
        if(origin == null || origin.length() == 0) return false;
        int subIndex = 0;
        for(int i = 0; i < origin.length(); ++i) {
            if(subIndex < sub.length() && origin.charAt(i) == sub.charAt(subIndex)) {
                ++subIndex;
            }
        }
        return sub.length() == subIndex;
    }
}