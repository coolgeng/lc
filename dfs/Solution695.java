package dfs;

/**
 * Solution695
 */
public class Solution695 {
    int maxArea = 0;
    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length ==0 || grid[0].length == 0) {return 0;}
        int n = grid.length;
        int m = grid.length;
        int area = 0;
        for (int i = 0 ; i < n ; i ++) {
            for (int j=0; j < m ; j ++) {
                if (grid[i][j] == 1) {
                    area ++ ;
                    maxArea = Math.max(area,maxArea);
                    dfs(grid, i, j, area);
                }
            }
        }
        return maxArea;
    }
    
    void dfs(int[][] grid, int i, int j, int area) {
        int n = grid.length;
        int m = grid.length;
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0) return;
        area ++;
        grid[i][j] = 0;
        dfs(grid, i-1, j , area);
        dfs(grid, i+1, j , area);
        dfs(grid, i, j-1 , area);
        dfs(grid, i, j+1, area);
    }
    
}