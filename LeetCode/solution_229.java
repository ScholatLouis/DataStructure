public class solution_229 {
    public static void main(String[] args) {}

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> majorityList = new ArrayList<Integer>();
        if(nums == null || nums.length == 0)
            return majorityList;
        int countFirst = 0;
        int countSecond = 0;
        int majorityCount = nums.length / 3;
        long majorityFirst = Long.MAX_VALUE;
        long majoritySecond = Long.MAX_VALUE;
        for(int num : nums) {
            if(majorityFirst == num) {
                ++countFirst;
            } else if(majoritySecond == num) {
                ++countSecond;
            } else if(countFirst == 0) {
                majorityFirst = num; 
                ++countFirst;
            } else if(countSecond == 0) {
                majoritySecond = num;
                ++countSecond;
            } else {
                --countFirst;
                --countSecond;
            }
        }

        countFirst = 0;
        countSecond = 0;
        for(int num : nums) {
            if(majorityFirst == num)
                ++countFirst;
            if(majoritySecond == num)
                ++countSecond;
        }
        if(countFirst > majorityCount) 
            majorityList.add((int)majorityFirst);
        if(countSecond > majorityCount)
            majorityList.add((int)majoritySecond);
        return majorityList;
    }
}