public class LongestCommonSubstring {
    public static void main(String[] args) {
        LongestCommonSubstring longestCommonSubstring = new LongestCommonSubstring();
        String s1 = "abcdef";
        String s2 = "acbcf";
        longestCommonSubstring.longestCommonSubsequence(s1, s2);
    }

    public int longestCommonSubsequence(String s1, String s2) {
        char[] charStr1 = s1.toCharArray();
        char[] charStr2 = s2.toCharArray();
        StringBuffer sb = new StringBuffer();
        int longestCommonSubstrLength = 0;
        int[][] counter = new int[charStr1.length+1][charStr2.length+1];
        String[][] subsequence = new String[charStr1.length+1][charStr2.length+1];
        for(int i = 0; i < subsequence.length; ++i) {
            for(int j = 0; j < subsequence[i].length; ++j) {
                subsequence[i][j] = "";
            }
        }
        for(int i = 1; i < counter.length; ++i) {
            for(int j = 1; j < counter[i].length; ++j) {
                System.out.print(i + " ");
                if(charStr1[i-1] == charStr2[j-1]) {
                    counter[i][j] = counter[i-1][j-1] + 1;
                    subsequence[i][j] = subsequence[i-1][j-1] + charStr1[i-1];
                } else {
                    counter[i][j] = Math.max(counter[i-1][j], counter[i][j-1]);
                    subsequence[i][j] = subsequence[i-1][j].length() > subsequence[i][j-1].length()
                        ? subsequence[i-1][j] : subsequence[i][j-1];
                }
            }
        }
        for(int i = 0; i < counter.length; ++i) {
            for(int j = 0; j < counter[i].length; ++j) {
                System.out.print(counter[i][j] +  " " + subsequence[i][j] + " ");
            }
            System.out.println();
        }
        return longestCommonSubstrLength;
    }
}