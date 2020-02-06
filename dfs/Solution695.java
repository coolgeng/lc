package dfs;

/**
 * Solution695
 */
public class Solution695 {
    int maxArea = 0;
    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length ==0 || grid[0].length == 0) {return 0;}
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0 ; i < n ; i ++) {
            for (int j=0; j < m ; j ++) {
                if (grid[i][j] == 1) {                   
                    maxArea = Math.max(dfs(grid, i, j),maxArea);                    
                }
            }
        }
        return maxArea;
    }
    
    int dfs(int[][] grid, int i, int j) {
        int n = grid.length;
        int m = grid[0].length;
        if (i >= 0 && i < n && j >= 0 && j < m && grid[i][j] == 1) {
            grid[i][j] = 0;
            return 1 + dfs(grid, i-1, j) + dfs(grid, i+1, j) + dfs(grid, i, j-1) + dfs(grid, i, j+1);
        }
        return 0;        
    }
    

    // public int maxAreaOfIsland(int[][] grid) {
    //     int max_area = 0;
    //     for(int i = 0; i < grid.length; i++)
    //         for(int j = 0; j < grid[0].length; j++)
    //             if(grid[i][j] == 1)max_area = Math.max(max_area, AreaOfIsland(grid, i, j));
    //     return max_area;
    // }
    
    // public int AreaOfIsland(int[][] grid, int i, int j){
    //     if( i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1){
    //         grid[i][j] = 0;
    //         return 1 + AreaOfIsland(grid, i+1, j) + AreaOfIsland(grid, i-1, j) + AreaOfIsland(grid, i, j-1) + AreaOfIsland(grid, i, j+1);
    //     }
    //     return 0;
    // }
}