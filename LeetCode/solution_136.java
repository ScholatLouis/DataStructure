import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class solution_136 {
    public static void main(String[] args) {
        solution_136 solution = new solution_136();
        int[] nums = new int[]{4,1,2,1,2};
        solution.singleNumber2(nums);
    }

    public int singleNumber(int[] nums) {
        int single = 0;
        Map<Integer, Integer> singleNumberMap = new HashMap<Integer, Integer>();
        for(int item : nums) {
            singleNumberMap.put(item, singleNumberMap.getOrDefault(item, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> item : singleNumberMap.entrySet()) {
            if(item.getValue() == 1) {
                single = item.getKey();
            }
        }
        return single;
    }

    public int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        int preNums = nums[0];
        int count = 0;
        int single = 0;
        for(int item : nums) {
            if(preNums != item) {
                if(count == 1) {
                    single = preNums;
                    break;
                } else {
                    count = 1;
                    preNums = item;
                }
            } else {
                ++count;
            }
        }
        System.out.println(preNums);
        return preNums;
    }

    // use bit manipulation
    // A^A = 0 A^0=A
    public int singleNumber3(int[] nums) {
        int single = 0;
        for(int item : nums) 
            single ^= item;
        return single;
    }
}