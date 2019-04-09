public class solution_448 {
    public static void main(String[] args) {}
    
    public List<Integer> findDisappearNumbers(int[] nums) {
        List<Integer> head = new ArrayList<Integer>();
        if(nums == null || nums.length == 0)
            return head;
        for(int i = 0; i < nums.length; ++i) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; ++i) {
            if(nums[val] > 0) {
                head.add(i+1);
            }
        }

        return head;
    }
}