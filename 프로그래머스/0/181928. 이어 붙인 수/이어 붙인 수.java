class Solution {
    public int solution(int[] num_list) {
        int even = 0;
        int odd = 0;
        for (int n:num_list){
            if (n%2 == 0)
                even = even * 10 + n;
            else
                odd = odd * 10 + n;
        }
        return even + odd;
    }
}