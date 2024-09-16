import java.math.*;

class Solution {
    public int time(String time) {
        String[] tmp = time.split(":");
        int res = Integer.parseInt(tmp[0]) * 60 + Integer.parseInt(tmp[1]);
        return res;
    }
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int time = time(pos);
        int n_video_len = time(video_len);
        int n_op_start = time(op_start);
        int n_op_end = time(op_end);
        
        if (time <= n_op_end && n_op_start <= time) time = n_op_end;
        for (String c:commands){
            if (c.equals("next")) time = Math.min(n_video_len, time+10);
            else if (c.equals("prev")) time = Math.max(0, time-10);
            
            if (time <= n_op_end && n_op_start <= time) time = n_op_end;
        }
        
        if (time > n_video_len) return video_len;
        String answer = "";
        if (Integer.toString(time/60).length() < 2) answer += "0";
        answer += time/60 + ":";
        if (Integer.toString(time%60).length() < 2) answer += "0";
        answer += time%60;
        
        return answer;
    }
}