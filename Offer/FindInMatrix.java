public class FindInMatrix {
    public static void main(String[] args) {
        FindInMatrix findInMatrix = new FindInMatrix();
        int target = 0;
        int[][] matrix = new int[][]{
            0,1,2,3,   
            4,5,6,7,
        };
        findInMatrix.Find(matrix, target);
    }

    public boolean Find(int[][] matrix, int target) {
        // 对矩阵的异常判断
        if(matrix == null)
            return false;
        int row = 0;
        int col = matrix[0].length;
        while(col >= 0 && row <= matrix.length) {
            if(matrix[row][col] == target)
                return true;
            if(matrix[row][col] > target)
                --col;
            if(matrix[row][col] < target)
                ++row;
        }
        return false;
    }
}