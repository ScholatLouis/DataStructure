public class solution_461 {
    public static void main(String[] args) {
        hammingDistance(1, 4);
    }

    public static int hammingDistance(int x, int y) {
        int value = x ^ y;
        int distance = 0;
        while(value != 0) {
            System.out.println(value);
            ++distance;
            value &= value - 1;
        }
        System.out.println(distance);
        return distance;
    }
}