import java.util.Arrays;
import java.util.Comparator;

public class solution_179 {
    public static void main(String[] args) {
        int[] nums = new int[]{8, 20};
        System.out.println(largestNumber1(nums));
    }

    public static String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0)
            return "";
        String[] str = new String[nums.length];
        for(int i = 0; i < nums.length; ++i) {
            str[i] = nums[i] + "";
        }
        Arrays.sort(str, (s1, s2) -> (s2+s1).compareTo(s1+s2));
        String ret = "";
        for(String s : str) {
            ret += s;
        }
        if(ret.charAt(0) == '0')
            return "0";
        return ret;
    }

    public static String largestNumber1(int[] nums) {
        if(nums == null || nums.length == 0) 
            return "";
        String[] str = new String[nums.length];
        for(int i = 0; i < nums.length; ++i) {
            str[i] = nums[i] + "";
        }
        String ret = "";
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String str1, String str2) {
                String s1 = str1 + str2;
                String s2 = str2 + str1;
                return s2.compareTo(s1);
            }
        };
        Arrays.sort(str, comparator);
        for(String s : str) 
            ret += s;
        return ret;
    }
}