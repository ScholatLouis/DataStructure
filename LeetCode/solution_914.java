import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class solution_914 {
    public static void main(String[] args) {
        solution_914 solution = new solution_914();
        int[] nums = new int[]{1,1,1,1,2,2,2,2,2,2};
        boolean flag = solution.hasGroupsSizeX(nums);
        System.out.println(flag);
    }

    public boolean hasGroupsSizeX(int[] nums) {
        int gcd = 0;
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(int item : nums) {
            count.put(item, count.getOrDefault(item, 0) + 1);
        }
        for(int item : count.values()) {
            gcd = greatCommondDivisor(item, gcd);
        }
        return gcd > 1;
    }

    // 这里应该该用map数据结构来统计每个数出现的次数 然后再求最大公约数
    public boolean sorting(int[] nums) {
        Arrays.sort(nums);
        int pickNum = 0;
        int minNums = Integer.MAX_VALUE;
        int item = nums[0];
        List<Integer> bucket = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] == item) {
                ++pickNum;
            } else {
                minNums = Math.min(minNums, pickNum);
                bucket.add(pickNum);
                item = nums[i];
                pickNum = 1;
            }
        }
        bucket.add(pickNum);
        for(Integer bucketItem:bucket) {
            System.out.print(bucketItem + " ");
        }
        return pick(bucket, minNums);
    }

    public boolean pick(List<Integer> bucket, int minNums) {
        int gcd = 0;
        for(Integer item : bucket) {
            gcd = greatCommondDivisor(item, gcd);
        }
        System.out.println(gcd);
        return gcd > 1;
    }

    public int greatCommondDivisor(int a, int b) {
        return b > 0 ? greatCommondDivisor(b, a%b) : a;
    }

    
}