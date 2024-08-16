import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set <Integer> set = new HashSet();
        for (int k: nums) set.add(k);
        int answer = Math.min(nums.length/2, set.size());
        return answer;
    }
}