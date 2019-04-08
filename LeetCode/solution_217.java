public class solution_217 {
    public static void main(String[] args) {}

    public boolean containDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return false;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; ++i) {
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}