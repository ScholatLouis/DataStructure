public class BitManipulation {
    public static void main(String[] args) {
        int x = -93242;
        int count = 40;
        BitManipulation bitManipulation = new BitManipulation();
        bitManipulation.repeatedArithmeticRightShift(x, count);
        System.out.println();
        bitManipulation.repeatedLogicalRightShift(x, count);
        System.out.println();
        bitManipulation.getBit(3, 0);
        System.out.println();
        System.out.println(Integer.toBinaryString(-1 << 2));
    }

    /**
     * params x: --> position
     */
    // example 1 page 114
    public int repeatedArithmeticRightShift(int x, int count) {
        for(int i = count; i >=0; --i) {
            x >>= 1;
            System.out.print(x + " ");
        }
        return x;
    }
    public int repeatedLogicalRightShift(int x, int count) {
        for(int i = count; i >= 0; --i) {
            x >>>= 1;
            System.out.print(x + " ");
        }
        return x;
    }

    // --> 就是如何创建 000010000；111111000000；00000001111；111101111等类型的数据
    // get bit
    public boolean getBit(int num, int i) {
        System.out.println(((num & (1 << i)) != 0));
        return ((num & ( 1 << i)) != 0);
    }

    // set bit 
    public int setBit(int num, int i) {
        return num | 1 << i;
    }

    // clear bit 
    public int clearBit(int num, int i) {
        return num & (~(1 << i));
    }
    public int clearBitMSBthroughI(int num, int i) {
        // inclusive i
        return num & ((1 << i) -1);
    }
    public int clearBitIThrough0(int num, int i) {
        // inclusive i
        return num & (-1 << (i + 1));
    }
    
    // update bit
    public int updateBit(int num, int i, int bits1) {
        int value = bits1 ? 1 : 0;
        int mask = ~(1 << i);
        return (num & mask) | (value << i);
    }
}