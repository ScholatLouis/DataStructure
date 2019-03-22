public class solution_704 {
    public static void main(String[] args) {}

    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return -1;
        int low = 0;
        int high = nums.length;
        while(low < high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] > target)
                low = mid + 1;
            if(nums[mid] < target)
                high = mid;
        }
        return -1;
    }
}