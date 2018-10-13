public class solution_463 {
    public static void main(String[] args) {
        int[][] grid = new int[4][];
        grid[0] = new int[]{1,1,0,1};
        grid[1] = new int[]{1,1,1,0};
        grid[2] = new int[]{0,1,0,0};
        grid[3] = new int[]{1,1,0,0};
        solution_463 solution = new solution_463();
        solution.islandPerimeter(grid);
    }

    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int initialPerimeter = 0;
        for(int i = 0; i < grid.length; ++i) {
            for(int j = 0; j < grid[i].length; ++j) {
                if(grid[i][j] == 1) {
                    initialPerimeter = 4;
                    if(j - 1 >= 0 && grid[i][j-1] == 1)
                        --initialPerimeter;
                    if(j + 1 < grid[i].length && grid[i][j+1] == 1)
                        --initialPerimeter;
                    if(i - 1 >= 0 && grid[i-1][j] == 1)
                        --initialPerimeter;
                    if(i + 1 < grid.length && grid[i+1][j] == 1)
                        --initialPerimeter;
                } else {
                    initialPerimeter = 0;
                }
                perimeter += initialPerimeter;
                System.out.println(initialPerimeter + " " + i + " " + j);
            }
        }
        System.out.println(perimeter);
        return perimeter;
    }
}