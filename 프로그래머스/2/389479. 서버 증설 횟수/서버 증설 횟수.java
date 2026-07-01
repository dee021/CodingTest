import java.util.ArrayDeque;

class Solution {
    public int solution(int[] players, int m, int k) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        int answer = 0, server = 1, tmp;
        
        for (int t = 0; t < 24; t++) {
            if (ad.size() >= k) {
                server -= ad.poll();
            }
            
            if (server * m <= players[t]) {
                tmp = players[t] / m +1;
                ad.add(tmp - server);
                answer += tmp - server;
                server = tmp;
                System.out.println("add" + ad.peekLast());
            } else ad.add(0);
            
            // System.out.println(t + " " + server + " " + answer);
        }
        
        return answer;
    }
}