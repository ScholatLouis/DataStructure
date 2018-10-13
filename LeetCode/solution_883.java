public class solution_883 {
    public static void main(String[] args) {
        int[][] gird = new int[3][];
        gird[0] = new int[]{2,2,2};
        gird[1] = new int[]{2,1,2};
        gird[2] = new int[]{2,2,2};
        projectionArea(gird);
    }

    // 行列 在一遍遍历中便可以完成
    public static int projectionArea(int[][] gird) {
        int topShadow = 0;
        for(int i = 0; i < gird.length; ++i) {
            int maxRow = 0;
            int maxCol = 0;
            for(int j = 0; j < gird[i].length; ++j) {
                if(gird[i][j] > 0) ++topShadow;
                maxRow = Math.max(maxRow, gird[i][j]);
                maxCol = Math.max(maxCol, gird[j][i]);
            }
            topShadow = topShadow + maxRow + maxCol;
        }
        System.out.println(topShadow);
        return topShadow;
    }
}