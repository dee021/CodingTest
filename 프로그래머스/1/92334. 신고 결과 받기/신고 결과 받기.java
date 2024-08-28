import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length]; // 0으로 초기화
        Map <String, Integer> index = new HashMap();
        Map <String, Set<String>> log = new HashMap();
        for (int i = 0; i < id_list.length; i++){ // ans index 정보
            index.put(id_list[i], i);
            log.put(id_list[i], new HashSet());
        }
        
        String[] tmp;
        Set<String> values;
        for (int i = 0; i < report.length; i++){
            tmp = report[i].split(" ");
            if (!tmp[0].equals(tmp[1])) {
                values = log.get(tmp[1]);
                values.add(tmp[0]);
                log.put(tmp[1], values);
            }
        }
        
        for (int i = 0; i < id_list.length; i++){
            if (log.get(id_list[i]).size() >= k) {
                for (String name: log.get(id_list[i])){
                    answer[index.get(name)]++;
                }
            }
        }
        
        
        return answer;
    }
}