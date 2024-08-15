class Solution {
    public long solution(long n) {
        double x = Math.sqrt(n);
        long l = (new Double(x)).longValue();
        if (x == l) {
            return (l+1)*(l+1);
        }
        return -1;
    }
}