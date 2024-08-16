import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map <String, Integer> map = new HashMap();
        for (int i =0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        for (int r = 0; r < photo.length; r++){
            int s = 0;
            for (String n:photo[r]){
                if (map.containsKey(n)) s += map.get(n);
            }
            answer[r] = s;
        }
        return answer;
    }
}