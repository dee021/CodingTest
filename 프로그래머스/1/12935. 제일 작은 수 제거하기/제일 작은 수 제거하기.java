import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        int m = Arrays.stream(arr).min().getAsInt();
        int[] answer = new int[arr.length - 1];
        int idx = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != m) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        
        return answer;
    }
}