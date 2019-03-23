import java.util.PriorityQueue;

public class solution_414 {
    public static void main(String[] args) {}

    public int thridMax(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        int max = Integer.MIN_VALUE;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < nums.length; ++i) {
            max = Math.max(nums[i], max);
            if(queue.contains(nums[i])) {
                if(queue.size() < 3) {
                    queue.add(nums[i]);
                } else if(queue.peek() < nums[i]) {
                    queue.poll();
                    queue.add(nums[i]);
                }
            }
        }
        return queue.size() < 3 ? max : queue.peek();
    }
}