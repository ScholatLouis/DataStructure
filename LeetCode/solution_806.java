public class solution_806 {
    public static void main(String[] args) {
        int[] widths = new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "";
        numberOfLins(widths, s);
    }

    public static int[] numberOfLins(int[] widths, String s) {
        int line = s.length() > 0 ? 1 : 0;
        int units = 0;
        for(char item : s.toCharArray()) {
            units += widths[item - 'a'];
            if(units > 100) {
                ++line;
                units = widths[item - 'a'];
            }
        }
        int[] nums = new int[]{line, units};
        System.out.println(line + " : " + units);
        return nums;
    }
}