import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class solution_566 {
    public static void main(String[] args) {
        solution_566 solution = new solution_566();
        int[][] nums = new int[2][];
        nums[0] = new int[]{1,2};
        nums[1] = new int[]{3,4};
        int r = 2;
        int c = 2;
        solution.reshapeMatrix2(nums, r, c);
    }

    public int[][] reshapeMatrix(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;

        // validation check
        if(row * col != r * c) {
            return nums;
        }

        int[][] reshapeNums = new int[r][c];
        Queue<Integer> original = new LinkedList<Integer>();
        for(int i = 0; i < nums.length; ++i) {
            for(int j = 0; j < nums[i].length; ++j) {
                original.add(nums[i][j]);
            }
        }
        for(int i = 0; i < r; ++i) {
            for(int j = 0; j < c; ++j) {
                reshapeNums[i][j] = original.remove();
                System.out.print(reshapeNums[i][j]);
            }
            System.out.println();
        }

        return reshapeNums;
    }

    public int[][] reshapeMatrix2(int[][] nums, int r, int c) {
        if(nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        int row = 0;
        int col = 0;
        int[][] reshapeNums = new int[r][c];
        for(int i = 0; i < nums.length; ++i) {
            for(int j = 0; j < nums[0].length; ++j) {
                reshapeNums[row][col] = nums[i][j];
                ++col;
                if(col == c) {
                    ++row;
                    col = 0;
                }
            }
        }
        return reshapeNums;
    }
}