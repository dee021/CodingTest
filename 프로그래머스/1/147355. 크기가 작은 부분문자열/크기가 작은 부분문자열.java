class Solution {
    public int solution(String t, String p) {
        long n_p = Long.parseLong(p);
        StringBuilder sb = new StringBuilder(t.substring(0, p.length()));
        int answer = Long.parseLong(sb.toString()) <= n_p? 1: 0;
        if (t.length() == p.length()) return answer;
        for (char k: t.substring(p.length(), t.length()).toCharArray()){
            sb.append(k);
            sb.deleteCharAt(0);
            if (Long.parseLong(sb.toString()) <= n_p) answer++;
        }
        return answer;
    }
}