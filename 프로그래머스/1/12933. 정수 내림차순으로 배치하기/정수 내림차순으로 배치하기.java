import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] num = (""+n).toCharArray();
        Arrays.sort(num);
        StringBuffer sb = new StringBuffer();
        for (char k:num)
            sb.insert(0,k);
        return Long.parseLong(sb.toString());
    }
}