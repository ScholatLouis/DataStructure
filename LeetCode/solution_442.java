public class solution_442 {
    public static void main(String[] args) {}

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<Integer>();
        if(nums == null || nums.length == 0)
            return duplicates;
        for(int i = 0; i < nums.length; ++i) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            } else if(nums[val] < 0) {
                duplicates.add(Math.abs(nums[i]));
            }
        }
        return duplicates;
    }
}