import java.util.HashMap;

public class solution_594 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2,2,5,2,3,7};
        findLHS(nums);
    }

    public static int findLHS(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for(Integer key : map.keySet()) {
            if(map.containsKey(key + 1)) {
                result = Math.max(result, map.get(key) + map.get(key + 1));
            }
        }
        System.out.println(result);
        return result;
    }
}