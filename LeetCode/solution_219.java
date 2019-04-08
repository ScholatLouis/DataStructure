public class solution_219 {
    public static void main(String[] args) {}

    public boolean containsNearByDuplicates(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return false;
        for(int i = 0; i < nums.length - k; ++i) {
            if(nums[i] == nums[i+k])
                return true;
        }
        return false;
    }
}