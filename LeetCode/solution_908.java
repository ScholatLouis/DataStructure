public class solution_908 {
    public static void main(String[] args) {
        int[] A = new int[]{1};
        int K = 0;
        smallestRange(A, K);
    }

    public static int smallestRange(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for(int i = 0; i < nums.length; ++i) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        System.out.println(Math.max(0, max - min - 2*k));
        return Math.max(0, max - min - 2*k);
    }
}