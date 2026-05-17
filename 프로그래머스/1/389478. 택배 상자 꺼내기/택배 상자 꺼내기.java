import java.util.Arrays;

class Solution {
    public int solution(int n, int w, int num) {
        int answer = 1;
        
        // num idx
        int[] numIdx = getIdx(w, num);
        // n idx
        int[] nIdx = getIdx(w, n);
        
        // System.out.println(Arrays.toString(numIdx));
        // System.out.println(Arrays.toString(nIdx));
        
        answer = (n - 1) / w - (num - 1) / w;
        if (numIdx[1] > 0) {  // num 역방
            if (nIdx[1] > 0 && nIdx[0] <= numIdx[0]) answer++;
            else if (nIdx[1] == 0 && nIdx[0] >= numIdx[0]) answer++;
        } else { // num 정방
            if (nIdx[1] == 0 && nIdx[0] >= numIdx[0]) answer++;
            else if (nIdx[1] > 0 && nIdx[0] <= numIdx[0]) answer++;
        }
        return answer;
    }
    
    int[] getIdx(int w, int k) {
        int mod = (k-1) % w, dir = (k-1) / w % 2, idx = dir > 0 ? w - mod -1: mod;
        return new int[] {idx, dir};
    }
}