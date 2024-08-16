import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList <Integer> list = new ArrayList();
        for (int i = 1; i < numbers.length; i++){
            for (int j = 0; j < i; j++){
                if (!list.contains(numbers[i] + numbers[j]))
                    list.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}