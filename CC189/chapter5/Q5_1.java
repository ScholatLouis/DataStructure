public class Q5_1 {
    public static void main(String[] args) {
        int i = 2;
        int j = 6;
        int N = 19;
        int M = 1024;
        Q5_1 Q5_1 = new Q5_1();
        // Q5_1.insertFromIToJ(M, N, i, j);

        Q5_1.debugger();
    }

    /**
     * question: 5.1 Insertion
     */
    // 思路：拼接出111100000011 再做位运算
    public int insertFromIToJ(int M, int N, int i, int j) {
        // validation
        if(i >= 32 || j < i)
            return 0;
        int maskJ = (-1 << j + 1);
        int maskI = (1 << i) - 1;
        System.out.println(Integer.toBinaryString(maskJ));
        System.out.println(Integer.toBinaryString(maskI));
        System.out.println(Integer.toBinaryString(maskI | maskJ));
        int mixMask = maskI | maskJ;    // constructor 111100000011
        System.out.println(Integer.toBinaryString((M & mixMask)));
        System.out.println(Integer.toBinaryString((M & mixMask) | (N << i)));
        // M & minMask to clear bits from i to j
        // N << i move N into correct position
        return (M & mixMask) | (N << i);
    }

    public String binaryToString(int fraction) {
        return "ERROR";
    }

    public void debugger() {
        int n = 3;
        System.out.println((n & (n-1)) == 0);
    }
}