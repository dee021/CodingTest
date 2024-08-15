import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = k; i <= n; i = i + k){
            list.add(i);
        }
        return list;
    }
}