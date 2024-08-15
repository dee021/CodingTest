class Solution {
    public int solution(int a, int b) {
        int oper1 = Integer.parseInt(a + "" + b);
        int oper2 = 2*a*b;
        return Math.max(oper1, oper2);
    }
}