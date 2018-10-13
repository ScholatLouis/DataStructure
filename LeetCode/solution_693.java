public class solution_693 {
    public static void main(String[] args) {
        solution_693 solution = new solution_693();
        int num = 5;
        solution.hasAlternatinBits(num);
    }

    public boolean hasAlternatinBits(int num) {
        int preBit = num & 1;
        int topBits = Integer.highestOneBit(num);
        num >>= 1;
        while(topBits != 0) {
            if(preBit == (num&1)) 
                return false;
            preBit = (num&1);
            num >>= 1;
            topBits /= 2;
        }
        return true;
    }
}