public class solution_832 {
    public static void main(String[] args) {
        int[] A = new int[]{0,0,0};
        flipAndInvertRow(A);
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i < A.length; ++i) {
            A[i] = flipAndInvertRow(A[i]);
        }
        return A;
    }

    public static int[] flipAndInvertRow(int [] A) {
        int lower = 0;
        int heigher = A.length - 1;
        while(lower < heigher) {
            swap the lower index and heigher index 
            A[lower] = A[lower] + A[heigher];
            A[heigher] = A[lower] - A[heigher];
            A[lower] = A[lower] - A[heigher];
            ++lower;
            --heigher;
        }
        for(int i = 0; i < A.length; ++i) {
            A[i] = A[i] ^ 1;
            System.out.print(A[i] + " ");
        }
        System.out.println();
        return A;
    }

    public static int[] flipAndInvertRow2(int[] A) {
        int temp = 0;
        int lower = 0;
        int heigher = A.length - 1;
        while(lower <= heigher) {
            temp = A[lower] ^ 1;
            A[lower] = A[heigher] ^ 1;
            A[heigher] = temp;
            ++lower;
            --heigher;
        }
        return A;
    }
}