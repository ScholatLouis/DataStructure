public class solution_035 {
    public static void main(String[] args) {
        System.out.println("LouisZeng");
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 3;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int position = 0;
        for(int i = 0; i < nums.length; ++i) {
            if(target > nums[i]) {
                ++position;
            }
        }
        return position;
    }

    public static int binarySearch(int[] nums, int target) {
        return 0;
    }
}