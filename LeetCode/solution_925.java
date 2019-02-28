public class solution_925 {
    public static void main(String[] args) {
        String name = "pyplrz";
        String typed = "ppyypllr";
        System.out.println(isLongPressedName(name, typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if(name == null || name.length() == 0) return false;
        int typedIndex = 0;
        for(int i = 0; i < name.length();) {
            // typed shorter than name
            if(typedIndex >= typed.length())
                return false;
            if(name.charAt(i) == typed.charAt(typedIndex)) {
                ++i;
                ++typedIndex;
            } else if(typedIndex - 1 >= 0 && typed.charAt(typedIndex-1) == typed.charAt(typedIndex)) {
                ++typedIndex;
            } else {
                return false;
            }
        }
        return true;
    }
}