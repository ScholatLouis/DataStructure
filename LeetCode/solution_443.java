import java.util.Arrays;

public class solution_443 {
    public static void main(String[] args) {
        char[] str = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress2(str));
    }

    // 没有修改str modify the array in place
    public static int compress(char[] str) {
        if(str == null || str.length == 0)
            return 0;
        int[] letter = new int[126];
        for(int i = 0; i < str.length; ++i) {
            letter[str[i] - ' ']++;
        }
        System.out.println(Arrays.toString(letter));
        String s = "";
        for(int i = 0; i < letter.length; ++i) {
            if(letter[i] > 0) {
                s += Character.toString((char)(i + ' '));
                if(letter[i] > 1) {
                    String count = String.valueOf(letter[i]);
                    for(int j = 0; j < count.length(); ++j) {
                        s += count.charAt(j);
                    }
                }
            }
        }
        System.out.println(s);
        return s.length();
    }

    public static int compress2(char[] c) {
        if(c.length == 0 || c == null) 
            return 0;
        int compressIndex = 0;
        for(int i = 0; i < c.length;) {
            int count = 1;
            c[compressIndex++] = c[i++];
            while(i < c.length && c[i-1] == c[i]) {
                ++count;
                ++i;
            }
            if(count > 1) {
                String scount = String.valueOf(count);
                for(int j = 0; j < scount.length(); ++j) {
                    c[compressIndex++] = scount.charAt(j);
                }
            }
        }
        System.out.println(Arrays.toString(c));
        return compressIndex;
    }
}