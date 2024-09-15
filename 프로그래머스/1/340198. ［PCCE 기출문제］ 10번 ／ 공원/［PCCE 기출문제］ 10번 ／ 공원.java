import java.math.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int h = park.length; int w = park[0].length;
        int[][] dp = new int[h][w];
        int big = 0;
        for (int r = 0; r < h; r++){
            for (int c = 0; c < w; c++){
                if (park[r][c].equals("-1")){
                    if (r == 0) dp[0][c] = 1;
                    else if (c == 0) dp[r][0] = 1;
                    else dp[r][c] = Math.min(Math.min(dp[r-1][c], dp[r][c-1]), dp[r-1][c-1]) +1;
                    big = Math.max(big, dp[r][c]);
                }
            }
        }
        
        for (int l:mats){
            if (l <= big) answer = Math.max(answer, l);
        }
        
        
        return answer;
    }
}