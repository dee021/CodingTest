class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < schedules.length; i++) {
            int limit = timeConv(schedules[i] + 10), flag = 1;
            
            // System.out.println("-----------------");
            // System.out.println(schedules[i] + " " + limit);
            
            for (int j = 0; j < 7; j++) {
                if ((startday + j - 1) % 7 >= 5) continue;
                if (timelogs[i][j] > limit) {
                    flag = 0;break;
                }
            }
            
            if (flag > 0) answer++;
            
            // System.out.println("res: " + flag);
        }
        
        return answer;
    }
    
    int timeConv(int time) {
        if (time%100 >= 60) {
            time += 40;
        }
        return time;
    }
} 