public class solution_703 {
    public static void main(String[] args) {}

    private int size;
    private PriorityQueue<Integer> minHeap;
    public kthLargest(int k, int[] nums) {
        int count = 0;
        this.size = k;
        minHeap = new PriorityQueue<Integer>();
        for(int num : nums) {
            if(count >= k && minHeap.peek() < num) {
                minHeap.poll();
                minHeap.add(num);
            } else if(count < k) {
                minHeap.add(num);
            }
            ++count;
        }
    }

    public int add(int val) {
        if(minHeap.size() >= this.size && minHeap.peek() < val) {
            minHeap.poll();
            minHeap.add(val);
        } else if(minHeap.size() < this.size) {
            minHeap.add(val);
        }
        return minHeap.peek();
    }
}