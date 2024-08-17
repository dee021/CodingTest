class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int cur = 0;
        int h = health;
        int sec;
        for (int r = 0; r < attacks.length; r++){
            sec = attacks[r][0] - cur;
            h += (sec-1) * bandage[1] + ((sec-1)/bandage[0] * bandage[2]);
            h = Math.min(h, health);
            h -= attacks[r][1];
            if (h <= 0)
                return -1;
            cur = attacks[r][0];
        }
        return h;
    }
}
    // [3, 2, 7]
	// 	[[1, 15], [5, 16], [8, 6]]