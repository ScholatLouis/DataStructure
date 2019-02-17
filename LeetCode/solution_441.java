public class solution_441 {
    public static void main(String[] args) {
        int coins = 1804289383;
        arrangeCoins(coins);
    }

    public static int arrangeCoins(int coins) {
        if(coins <= 1) {
            return coins;
        }

        long low = 1;
        long high = coins;
        while(low <= high) {
            long mid = low + (high - low) / 2;
            long sum = (1 + mid) * mid / 2;
            if(sum > coins) {
                high = mid - 1;
            }
            if(sum < coins) {
                low = mid + 1;
            }
            if(sum == coins) {
                System.out.println(mid);
                return (int)mid;
            }
        }
        System.out.println(high);
        return (int)high;
    }
}