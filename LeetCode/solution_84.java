public class solution_84 {
    public static void main(String[] args) {}

    public static int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length == 0)
            return 0;

        int low = 0;
        int high = 0;
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i < heights.length; ++i) {
            low = high = i;
            while(low - 1 >= 0 && heights[low] >= heights[i])
                --low;
            while(high + 1 < heights.length && heights[high] >= heights[i])
                ++high;
            maxArea = Math.max(maxArea, heights[i] * (high - low + 1));
        }
        return maxArea;
    }
}