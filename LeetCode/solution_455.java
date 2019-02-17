import java.util.Arrays;

public class solution_455 {
    public static void main(String[] args) {
        int[] children = new int[]{1, 2};
        int[] cookieSize = new int[]{1, 2, 3};
        findContentedChildren(children, cookieSize);
    }

    public static int findContentedChildren(int[] children, int[] cookieSize) {
        if(children.length == 0 || cookieSize.length == 0) 
            return 0;
        int contentedChildren = 0;
        Arrays.sort(children);
        Arrays.sort(cookieSize);
        for(int i = 0, j = 0; i < children.length && j < cookieSize.length;) {
             if(cookieSize[j] >= children[i]) {
                 ++contentedChildren;
                 ++i;
             }
             ++j;
        }
        System.out.println(contentedChildren);
        return contentedChildren;
    }
}