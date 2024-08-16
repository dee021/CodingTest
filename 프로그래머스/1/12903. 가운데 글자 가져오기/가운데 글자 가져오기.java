class Solution {
    public String solution(String s) {
        int idx = s.length()/2;
        String answer = "" + s.charAt(idx);
        if (s.length()%2 == 0) return s.charAt(idx-1) + answer;
        return answer;
    }
}