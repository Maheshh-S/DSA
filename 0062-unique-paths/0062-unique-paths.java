class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return cntPaths(m-1, n-1 , dp);
    }

    int cntPaths(int row , int col, int[][] dp){
        if(row == 0 || col ==0){
            return 1;
        }

        if(dp[row][col] != 0){
            return dp[row][col];
        }

        dp[row][col] =  cntPaths(row-1, col , dp) + cntPaths(row, col-1,dp);

        return dp[row][col];
    }
}