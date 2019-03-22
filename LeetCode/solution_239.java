public class solution_239 {
    public static void main(String[] args) {}

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0)
            return new int[]{};
        int count = 0;
        int[] result = new int[nums.length - k + 1];
        Queue<Integer> queue = new PriorityQueue<Integer>(new comparator() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(int i = 0; i < nums.length; ++i) {
            if(queue.size() >= k) {
                result[count++] = queue.peek();
                queue.remove(nums[i - k]);
                queue.add(nums[i]);
            } else {
                queue.add(nums[i]);
            }
        }
        result[count++] = queue.peek();
        return result;
    }
}