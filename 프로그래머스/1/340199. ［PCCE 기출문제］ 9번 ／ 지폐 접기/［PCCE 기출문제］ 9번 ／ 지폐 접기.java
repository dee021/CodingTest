import java.math.*;

class Solution {
    public int[] swap(int big, int small) {
        if (big < small) {
            int tmp = big;
            big = small;
            small = tmp;
        }
        int [] res = {big, small};
        return res;
    } 
    
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int wb, ws, b, s;
        int[] tmp = swap(wallet[0], wallet[1]);
        wb = tmp[0];
        ws = tmp[1];
        tmp = swap(bill[0], bill[1]);
        b = tmp[0];
        s = tmp[1];
        while (wb < b || ws < s) {
            answer++;
            tmp = swap(b/2, s);
            b = tmp[0];
            s = tmp[1];
        }
        return answer;
    }
}