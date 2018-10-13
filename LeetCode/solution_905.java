public class solution_905 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,9,13};
        sortArrayByParity(nums);
    }

    public static int[] sortArrayByParity(int[] A) {
        int temp = -1;
        int lower = 0;
        int heigher = A.length - 1;
        
        while(lower < heigher) {
            while(lower < heigher && A[lower] % 2 == 0) {
                ++lower;
            }
            
            while (heigher > 0 && A[heigher] % 2 != 0) {
                --heigher;
            }
            if(lower < heigher) {
                temp = A[lower];
                A[lower] = A[heigher];
                A[heigher] = temp;
            }
            System.out.println(lower + " : " + heigher);
            System.out.println(A[lower] + " : " + A[heigher]);
            for(int item : A) {
                System.out.print(item);
            }
            System.out.println();
            ++lower; --heigher;
        }

        return A;   
    }

    public static int[] sortArrayByParity1(int[] A) {
        int lower = 0;
        int heigher = A.length - 1;
        while(lower < heigher) {
            if(A[lower] % 2 == 0) {
                ++lower;
            }

            if(A[heigher] % != 0) {
                --heigher;
            }

            if(A[lower] % 2 > A[heigher] % 2) {
                int temp = A[lower];
                A[lower] = A[heigher];
                A[heigher] = A[lower];
            }
        }
        return A;
    }
}