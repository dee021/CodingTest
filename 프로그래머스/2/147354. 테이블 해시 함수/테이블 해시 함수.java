import java.util.Comparator;
import java.util.Arrays;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        Arrays.sort(data, new Comparator<int[]> () {
            public int compare(int[] o1, int[] o2) {
		        if (o1[col-1] > o2[col-1]) return 1;
                else if (o1[col-1] < o2[col-1]) return -1;
                else if (o1[0] > o2[0]) return -1;
                else return 1;
	        }
        });
        
        for (int r = row_begin-1; r < row_end; r++){
            int tmp = 0;
            for (int c = 0; c < data[0].length; c++){
                tmp += data[r][c] % (r+1);
            }
            answer ^= tmp; 
        }
        return answer;
    }
}