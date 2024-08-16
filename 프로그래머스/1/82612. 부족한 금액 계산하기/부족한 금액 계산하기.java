class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int cost = price;
        while (count > 0){
            answer += cost;
            count -= 1;
            cost += price;
        }

        return answer <= money?0:answer - money;
    }
}