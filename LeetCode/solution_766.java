import java.util.Map;
import java.util.HashMap;

public class solution_766 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][];
        matrix[0] = new int[]{1,2,3,4};
        matrix[1] = new int[]{5,1,2,3};
        matrix[2] = new int[]{9,5,1,2};
        System.out.println(isToeplitzMatrix2(matrix));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        HashMap<Integer, Integer> diagonal = new HashMap<Integer, Integer>();
        for(int row = 0; row < matrix.length; ++row) {
            for(int col = 0; col < matrix[row].length; ++col) {
                if(!diagonal.containsKey(row - col)) {
                    diagonal.put(row-col, matrix[row][col]);
                } else if(diagonal.get(row-col) != matrix[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isToeplitzMatrix2(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 1; i < row; ++i) {
            for(int j = 1; j < col; ++j) {
                if(matrix[i][j] != matrix[i-1][j-1])
                    return false;
            }
        }
        return true;
    }
}