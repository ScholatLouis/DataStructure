import java.util.HashMap;
import java.util.Map.Entry;

public class solution_387 {
    public static void main(String[] args) {
        String s = "dddccdbba";
        System.out.println(firstUniqueChar(s));
    }

    public static int firstUniqueChar(String s) {
        if(s == null || s.length() == 0)
            return -1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : s.toCharArray()) {
            System.out.println(c);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map.size());
        System.out.println("============");
        for(int i = 0; i < s.length(); ++i) {
            if(map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}