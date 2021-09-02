class Solution {
    int currentMax = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int numberOfColumns = grid[0].length;
        int numberOfRows = grid.length;
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if(grid[i][j]==1){
                    currentMax = 0;
                    findArea(grid,i,j,numberOfRows,numberOfColumns);
                    maxArea = Math.max(currentMax, maxArea);
                }
            }
        }
        return maxArea;
    }
    public void findArea(int[][] grid,int x,int y,int rows,int cols){
        if(x<0||y<0||x>=rows||y>=cols||grid[x][y]==0){
            return ;
        }
        grid[x][y] = 0;
        currentMax+=1;
        findArea(grid, x+1, y, rows, cols);
        findArea(grid, x-1, y, rows, cols);
        findArea(grid, x, y+1, rows, cols);
        findArea(grid, x, y-1, rows, cols);
    }
}