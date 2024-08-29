import java.math.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int n = triangle.length;
        int dp[][] = new int[n][];
        dp[0] = new int[1];
        dp[0][0] = triangle[0][0];
        for (int r = 1; r < n; r++) {
            dp[r] = new int[r+1];
            
            dp[r][0] = dp[r-1][0] + triangle[r][0];
            for (int c = 1; c < r; c++) {
                dp[r][c] = Math.max(dp[r-1][c-1], dp[r-1][c]) + triangle[r][c];
            }
            dp[r][r] = dp[r-1][r-1] + triangle[r][r];
        }
        
        for (int i = 0; i < n; i++){
            answer = Math.max(answer, dp[n-1][i]);
        }
        
        return answer;
    }
}