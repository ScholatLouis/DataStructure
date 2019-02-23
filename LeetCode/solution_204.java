public class solution_204 {
    public static void main(String[] args) {
        int n = 10;
        int count = countPrimes2(n);
        System.out.println(count);
    }

    public static int countPrimes(int n) {
        if(n <= 1) 
            return 0;
        int count = 0;
        for(int i = 2; i <n; ++i) {
            boolean isPrimse = true;
            for(int j = 2; j < i; ++j) {
                if(i % j == 0) {
                    isPrimse = false;
                    break;
                }
            }
            if(isPrimse) {
                ++count;
                System.err.print(i + " ");
            }
            System.out.println();
        }
        return count;
    }

    public static int countPrimes2(int n) {
        if(n <= 1) 
            return 0;
        int count = 0;
        for(int i = 2; i < n; ++i) {
            boolean isPrimer = true;
            for(int j = 2; j * j <= i; ++j) {
                if(i % j == 0) 
                    isPrimer = false;
            }
            if(isPrimer) {
                ++count;
                System.err.print(i + " ");
            }
        }
        return count;
    }
}