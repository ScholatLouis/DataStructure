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
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums == null || nums.length < 3)
            return list;

        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; ++i) {
            if(i == 0 || (i > 0 && nums[i] != nums[i+1])) {
                List twoSumList = twoSum(nums, 0 - nums[i], i+1);
                if(twoSumList != null && twoSumList.size() > 0) {
                    list.addAll(twoSumList);
                }
            }
        }
        return list;
    }

    public static List<List<Integer>> twoSum(int[] nums, int target, int start) {
        int low = start;
        int high = nums.length - 1;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        while(low < high) {
            if(nums[low] + nums[high] == target) {
                list.add(Arrays.asList(nums[low], nums[high], 0-target));
                while(low < high && nums[high] == nums[high-1])
                    --high;
                while(low < high && nums[low] == nums[low+1])
                    ++low;
                ++low;
                --high;
            } else if(nums[low] + nums[high] > target) {
                --high;
            } else {
                ++low;
            }
        }
        return list;
    }
}