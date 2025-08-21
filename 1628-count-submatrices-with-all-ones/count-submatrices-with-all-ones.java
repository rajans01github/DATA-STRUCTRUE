class Solution {
    public int numSubmat(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int[][] heights = new int[n][m];
        
        // Step 1: Build heights
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (mat[i][j] == 0) heights[i][j] = 0;
                else heights[i][j] = (i == 0 ? 1 : heights[i-1][j] + 1);
            }
        }
        
        int count = 0;
        
        // Step 2: Count submatrices row by row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int minHeight = heights[i][j];
                for (int k = j; k >= 0 && minHeight > 0; k--) {
                    minHeight = Math.min(minHeight, heights[i][k]);
                    count += minHeight;
                }
            }
        }
        
        return count;
    }
}
