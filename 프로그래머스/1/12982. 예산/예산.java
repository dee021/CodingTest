import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for (int k:d){
            if (budget >= k){
                budget -= k;
                answer++;
            } else break;
        }
        return answer;
    }
}