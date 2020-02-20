package day1;

/**
 * Solution200
 */
public class Solution200 {
        
    public int numIslands(char[][] grid) {
        int n = 0;
        int m = 0;
        int count = 0;
        if (grid.length == 0 || grid[0].length == 0) return 0;
        n = grid.length;
        m = grid[0].length;
        for (int i=0; i<n; i++) {
            for (int j=0;j<m; j++) {
                if (grid[i][j] =='1') {
                    DFSMarking(grid, i, j, n, m);
                    ++count;
                }                
            }
        }
        return count;
    }
    
    private void DFSMarking(char[][] grid, int i, int j, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == '0') return;
        grid[i][j] = '0';
        DFSMarking(grid, i+1, j, n, m);
        DFSMarking(grid, i-1, j, n, m);
        DFSMarking(grid, i, j+1, n, m);
        DFSMarking(grid, i, j-1, n, m);
    }
}   