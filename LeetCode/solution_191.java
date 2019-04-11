public class solution_191 {
    public static void main(String[] args) {}

    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            ++count;
            // 把最后一位1置为0，重置的次数即为1的个数 
            n = n & (n - 1);
        }
        return count;
    }
}