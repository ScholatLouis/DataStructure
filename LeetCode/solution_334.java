public class solution_334 {
    public static void main(String[] args) {
        solution_334 solution = new solution_334();
        String str = "A man, a plan, a canal: Panama";
        solution.reverseString2(str);
    }

    public String reverseString(String str) {
        StringBuffer buffer = new StringBuffer(str);
        System.out.println(buffer.reverse().toString());
        return buffer.reverse().toString();
    }

    public String reverseString2(String str) {
        char[] chars = str.toCharArray();
        int lower = 0;
        int height = chars.length - 1;
        while(lower < height) {
            char c = chars[lower];
            chars[lower] = chars[height];
            chars[height] = c;
            ++lower;
            --height;
        }
        System.out.println(new String(chars));
        return new String(chars);
    }
}