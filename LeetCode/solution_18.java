import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class solution_18 {
    public static void main(String[] args) {}

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0)
            return list;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; ++i) {
            if(i == 0 || i > 0 && nums[i] != nums[i-1]) {
                list.addAll(threeSum(nums, nums[i], target, i));
            }
        }
        return list;
    }

    public List<List<Integer>> threeSum(int[] nums, int first, int target, int start) {
        int preValue = Integer.MAX_VALUE;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = start + 1; i < nums.length - 2; ++i) {
            if(nums[i] != preValue) {
                list.addAll(twoSum(nums, first, nums[i], target, i));
                preValue = nums[i];
            }
        }
        return list;
    }

    public List<List<Integer>> twoSum(int[] nums, int first, int second, int target, int start) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int low = start + 1;
        int high = nums.length - 1;
        while(low < high) {
            if(nums[low] + nums[high] == target) {
                list.add(Arrays.asList(first, second, nums[low], nums[high]));
                while(low < high && nums[low] == nums[low+1])
                    ++low;
                while(low < high && nums[high] == nums[high-1])
                    --high;
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