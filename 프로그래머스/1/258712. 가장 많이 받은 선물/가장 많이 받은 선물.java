import java.util.*;

class Solution {
    
    public int solution(String[] friends, String[] gifts) {
        String[] s;
        int ans = 0;
        int tmp = 0;
        Map <String, Integer> index = new HashMap();
        for (int i = 0; i < friends.length; i++) index.put(friends[i], i);
        int[] score_array = new int[friends.length];
        int[][] gift_array = new int[friends.length][friends.length];
        for (int i = 0; i < gifts.length; i++){
            s = gifts[i].split(" ");
            gift_array[index.get(s[0])][index.get(s[1])] += 1;
            score_array[index.get(s[0])]+=1;
            score_array[index.get(s[1])]-=1;
        }
        for (int i = 0; i < gift_array.length; i++){
            tmp = 0;
            for (int j = 0; j < gift_array.length; j++) {
                if (gift_array[i][j] > gift_array[j][i]) tmp += 1;
                else if(gift_array[i][j] == gift_array[j][i] && score_array[i] > score_array[j]) tmp+=1;}
            ans = Math.max(ans, tmp);
        }
        return ans;
    }
}