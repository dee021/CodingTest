import java.util.ArrayList;

class Solution {
    public ArrayList <Integer> solution(int[] answers) {
        int[] score = new int[3];
        int[] one = {1,2,3,4,5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int o = 0;
        int t = 0;
        int th = 0;
        int max = 0;
        for (int i = 0; i < answers.length; i++){
            if (one[o] == answers[i]) score[0] += 1;
            if (two[t] == answers[i]) score[1] += 1;
            if (three[th] == answers[i]) score[2] += 1;
            o = (o+1)%5;
            t = (t+1)%two.length;
            th = (th+1)%three.length;
        }
        int m = 0;
        ArrayList <Integer> answer = new ArrayList();
        for (int i = 0; i < 3; i++){
            if (score[i] > m){
                m = score[i];
                answer.clear();
                answer.add(i+1);
            } else if (score[i] == m) answer.add(i+1);
        }

        return answer;
    }
}