import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Set <String> set = new HashSet<String>();
        for (String s:s1)
            set.add(s);
        
        int answer = 0;
        for (String s:s2){
            if (set.contains(s)) answer += 1;
        }
        
        return answer;
    }
}