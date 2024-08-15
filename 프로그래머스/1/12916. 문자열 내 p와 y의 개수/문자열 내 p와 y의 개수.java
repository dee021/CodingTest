class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        
        for (char c:s.toLowerCase().toCharArray()){
            if (c == 'p') p+=1;
            else if(c == 'y') y+=1;
        }
        
        return p == y;
    }
}