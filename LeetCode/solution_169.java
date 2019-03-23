public class solution_169 {
    public static void main(String[] args) {}

    // 投票算法
    public int majorityElements(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        int count = 0;
        int majority = Integer.MAX_VALUE;
        for(int num : nums) {
            if(majority == num) {
                ++count;
            } else if(count == 0) {
                majority = count;
                ++count;
            } else {
                --count;
            }
        }
        return majority;
    }

    // 使用HashMap记录每次数值出现的次数

    // brute force解决
}