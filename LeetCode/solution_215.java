import java.util.Arrays;
import java.util.PriorityQueue;

public class solution_215 {
    public static void main(String[] args) {}

    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0)
            return -1;

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < nums.length; ++i) {
            if(queue.size() < k) {
                queue.add(nums[i]);
            } else if(queue.peek() < nums[i]) {
                queue.poll();
                queue.add(nums[i]);
            }
        }
        return queue.peek();
    }

    public int findKthLargest2(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[k];
    }

}