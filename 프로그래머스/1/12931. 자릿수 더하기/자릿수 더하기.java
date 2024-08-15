import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (char num:(""+n).toCharArray())
            answer += Integer.parseInt(String.valueOf(num));
        return answer;
    }
}