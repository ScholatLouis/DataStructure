import java.util.Arrays;
import java.util.HashMap;

public class solution_205 {
    public static void main(String[] args) {
        String s = "ab", t = "aa";
        System.out.println(isIsomorphic2(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); ++i) {
            if(!map.containsKey(s.charAt(i))) {
                if(!map.containsValue(t.charAt(i)))
                    map.put(s.charAt(i), t.charAt(i));
                else 
                    return false;
            } else {
                if(map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
        }
        return true;
    }

    public static boolean isIsomorphic2(String s, String t) {
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;

        // 默认生成的数值都为0
        int[] map = new int[512];
        for(int i = 0; i < s.length(); ++i) {
            if(map[s.charAt(i)] != map[t.charAt(i)] + 256)
                return false;
            map[s.charAt(i)] = map[t.charAt(i) + 256] = i+1;
        }
        return true;
    }
}