class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int s, e;
        for (int i = 0; i < my_strings.length; i++){
            s = parts[i][0];
            e = parts[i][1];
            answer += my_strings[i].substring(s, e+1);
            }
        return answer;
    }
}