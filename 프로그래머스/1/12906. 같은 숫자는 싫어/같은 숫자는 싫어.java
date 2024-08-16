import java.util.*;

public class Solution {
    public ArrayList <Integer> solution(int []arr) {
        int l = 0;
        ArrayList <Integer> answer = new ArrayList();
        answer.add(arr[0]);
        for (int num:arr){
            if (answer.get(l) != num) {
                answer.add(num);
                l++;
            }
        }
        return answer;
    }
}