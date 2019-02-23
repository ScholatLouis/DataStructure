import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class solution_15 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        int target = 0;
        threeSum(nums, target);
    }

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return null;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length; ++i) {
            List<Integer> twoResult = twoSum(nums, target - nums[i]);
            if(twoResult.size() != 0) {
                twoResult.add(nums[i]);
                result.add(twoResult);
            } 
        }
        // System.out.println(result.toString());
        return result;
    }

    public static List<Integer> twoSum(int[] nums, int target) {
        List<Integer> twoResult = new ArrayList<Integer>();
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            if(nums[low] + nums[high] > target)
                --high;
            else if(nums[low] + nums[high] < target) 
                ++low;
            else {
                twoResult.add(nums[low]);
                twoResult.add(nums[high]);
                System.out.println(twoResult.toString());
                return twoResult;
            }
        }
        
        return twoResult;
    }
}