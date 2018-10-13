public class solution_762 {
    public static void main(String[] args) {
        solution_762 solution = new solution_762();
        int L = 10;
        int R = 15;
        solution.countPrimeSetBits(L, R);
    }

    public int countPrimeSetBits(int L, int R) {
        int setBits = 0;
        int primeCounter = 0;
        for(int i = L; i <= R; ++i) {
            setBits = countSetBits(i);
            if(isPrime(setBits)) 
                ++primeCounter;
        }
        System.out.println(primeCounter);
        return primeCounter;
    }

    public int countSetBits(int num) {
        int counter = 0;
        int topBits = Integer.highestOneBit(num);
        while(topBits != 0) {
            if((num&1) == 1)
                ++counter;
            num >>= 1;
            topBits /= 2;
        }
        System.out.println(counter);
        return counter;
    }

    public boolean isPrime(int num) {
        if(num < 2) return false;
        if(num == 2) return true;
        for(int i = 2; i < num-1; ++i) 
            if(num % i == 0)
                return false;
        return true;
    }
}