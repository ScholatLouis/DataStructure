public class solution_868 {
    public static void main(String[] args) {
        int N = 8;
        System.out.println(binaryGroup2(N));
    }

    public static int binaryGroup(int N) {
        int distance = 0;
        int count = 0;
        int pre = 0;
        int binaryFlag = 0;
        while(N != 0) {
            if((N & 1) != 1) {
                ++count;
            } else {
                if(binaryFlag == 0)
                    pre = count;
                distance = Math.max(distance, count - pre);
                pre = count;
                ++count;
                ++binaryFlag;
            }
            N >>= 1;
            // System.out.println(N);
        }
        return binaryFlag > 1 ? distance : 0;
    }

    public static int binaryGroup2(int N) {
        int count = -32;
        int distance = 0;
        while(N != 0) {
            if((N & 1) == 1) {
                distance = Math.max(distance, count);
                count = 0;
            }
            ++count;
            N >>= 1;
        }
        return distance;
    }
}