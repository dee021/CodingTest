import java.util.Arrays;

class Solution {
    static int start, end, order;
    static int[] tmp;
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int idx = 0; idx < commands.length; idx++){
            start = commands[idx][0] -1;
            end = commands[idx][1];
            order = commands[idx][2]-1;
            tmp = Arrays.copyOfRange(array, start, end);
            Arrays.sort(tmp);
            answer[idx] = tmp[order];
        }
        return answer;
    }
}