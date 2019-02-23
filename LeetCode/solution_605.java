public class solution_605 {
    public static void main(String[] args) {
        int[] flowered = new int[]{0, 0, 1, 0, 0};
        int n = 1;
        canPlantFlowers(flowered, n);
    }

    public static boolean canPlantFlowers(int[] flowered, int n) {
        if(flowered.length == 0 || flowered == null)
            return false;
        
        for(int i = 0; i < flowered.length; ++i) {
            if(flowered[i] == 1)
                continue;
            int pre = i == 0 ? 0 : flowered[i - 1];
            int next = i == flowered.length - 1 ? 0 : flowered[i+1];
            if(pre == 0 && next == 0) {
                --n;
                flowered[i] = 1;
            }
        }

        System.out.println(n);
        return  n <= 0;
    }
}