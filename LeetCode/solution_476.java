public class solution_476 {
    public static void main(String[] args) {
        solution_476 solution = new solution_476();
        int num = -5;
        solution.flipComplement1(num);
    }

    // 构造0000011111
    // 因为position 的complement为negetive 11111...
    // 所以要将前面的111变为0000
    public int flipComplement1(int num) {
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toBinaryString(~num));
        System.out.println(~num);
        System.out.println(Integer.highestOneBit(num)<<1);
        System.out.println((~num) & ((Integer.highestOneBit(num)<<1) - 1));
        return ~num;
    }

    public int flipComplement(int num) {
        int flip = 0;
        int digits = 0;
        int xorNums = 0;
        int quotient = num;
        // decimal to binary
        while(quotient != 0) {
            xorNums += (int)(Math.pow(10, digits));
            flip += (quotient % 2) * (int)(Math.pow(10, digits));
            quotient = quotient / 2;
            ++digits;
        }
        System.out.println(xorNums);
        System.out.println(flip);
        System.out.println(~num);
        flip = flip ^ xorNums;
        System.out.println(flip);
        System.out.println(1000 ^ 1111);
        // binary to decimal
        num = 0;
        int count = 0;
        while(digits != 0) {
            num += flip % 10 * (int)(Math.pow(2, count));
            flip /= 10;
            ++count;
            --digits;
        }
        System.out.println(num);
        return num;
    }
}