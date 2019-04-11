import java.util.Arrays;

public class solution_268 {
    public static void main(String[] args) {}

    public int missingNumber(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        int sum = 0;
        for(int num : nums)
            sum += num;
        return (nums.length * (nums.length + 1)) / 2 - sum;
    }

    public int missingNumber2(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        Boolean[] position = new Boolean[nums.length + 1];
        Arrays.fill(position, Boolean.FALSE);
        for(int i = 0; i < nums.length; ++i) {
            position[nums[i]] = true;
        }

        int miss = Integer.MAX_VALUE;
        for(int i = 0; i < position.length; ++i) {
            if(!position[i])
                miss = i;
        }
        return miss;
    }
}