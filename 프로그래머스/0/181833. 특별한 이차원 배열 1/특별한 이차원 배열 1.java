import java.util.Arrays;

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++){
            Arrays.fill(answer[i], 0);
            answer[i][i] = 1;
        }
        return answer;
    }
}