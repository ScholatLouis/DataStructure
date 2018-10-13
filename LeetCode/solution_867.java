import java.util.Arrays;

public class solution_867 {
    public static void main(String[] args) {
        int[][] gird = new int[3][];
        gird[0] = new int[]{1,2};
        gird[1] = new int[]{3,4};
        gird[2] = new int[]{5,6};
        transpose(gird);
    }

    public static int[][] transpose(int[][] A) {
        int[][] transposeArr = new int[A[0].length][A.length];
        for(int i = 0; i < A.length; ++i) {
            for(int j = 0; j < A[i].length; ++j) {
                transposeArr[j][i] = A[i][j];
            }
        }

        for(int i = 0; i < transposeArr.length; ++i) {
            for(int item : transposeArr[i]) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
        return transposeArr;
    }
}