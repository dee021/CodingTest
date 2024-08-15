import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList();
        for (int num:arr){
            boolean flag = true;
            for (int del:delete_list){
                if (num == del){
                    flag = false;
                    break;
                }
            }
            if (flag)
                answer.add(num);
        }
        return answer;
    }
}