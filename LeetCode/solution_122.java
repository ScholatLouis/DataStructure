public class solution_122 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        maxProfit(arr);
    }

    public static int maxProfit(int[] arr) {
        if(arr.length == 0 || arr == null) {
            return 0;
        }

        int profit = 0;
        for(int i = 0; i < arr.length - 1; ++i) {
            if(arr[i] < arr[i+1])
                profit += arr[i+1] - arr[i];
        }
        
        System.out.println(profit);
        return profit;
    }
}