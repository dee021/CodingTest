import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> list;
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        list = new ArrayList();
        for (int i = 0; i < score.length; i++){
            if (list.size() < k) {
                append(score[i]);
            } else if (list.get(0) < score[i]) {
                list.remove(0);
                append(score[i]);
            }
            answer[i] = list.get(0);
        }
        return answer;
    }
    
    int append(int k){
        if (list.size() == 0) {
            list.add(k);
            return 0;
        }
        else {
            for (int i = 0; i < list.size(); i++){
                if (k <= list.get(i)){
                    list.add(i, k);
                    return 0;
                }
            }
            list.add(k);
            return 0;
        }
    }
}