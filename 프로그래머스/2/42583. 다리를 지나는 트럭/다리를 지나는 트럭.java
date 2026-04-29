import java.util.ArrayDeque;
import java.util.Arrays;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sec = 0;
        ArrayDeque<int[]> ad = new ArrayDeque<>();
        int bridge_weight = 0;

        for (int w: truck_weights){
            sec++;
            
            if (!ad.isEmpty() && sec - ad.peek()[1] >= bridge_length) {
                bridge_weight -= ad.poll()[0];
            }

            
            while (bridge_weight + w > weight || ad.size() >= bridge_length){
                    sec += bridge_length - (sec - ad.peek()[1]);
                    bridge_weight -= ad.poll()[0];
                }
            
            
            int [] truck = new int[2];
            truck[0] = w;
            truck[1] = sec;
            ad.add(truck);
            bridge_weight += w;
        }
        return ad.peekLast()[1] + bridge_length;
    }
}