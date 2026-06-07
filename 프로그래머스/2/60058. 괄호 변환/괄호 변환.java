import java.util.ArrayList;

class Solution {
    public String solution(String p) {
    
        return sol(p);
    }
    
    String sol(String p) {
        if (p.equals("")) return "";
        
        int cnt = 0;
        ArrayList<Character> al = new ArrayList<>();
        
        
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                cnt++;
                al.add('(');
            } else {
                cnt--;
                if (!al.isEmpty() && al.get(al.size()-1) == '(') al.remove(al.size()-1);
                else al.add(')');
            }
            
            if (cnt == 0) {// u 처리
                if (al.isEmpty()) // 3
                    return p.substring(0, i+1) + sol(p.substring(i+1));
                // 4
                return "(" + sol(p.substring(i+1)) + ")" + rev(p.substring(1, i));
            }
        }
        if (al.isEmpty()) return p;
        return "(" + ")" + rev(p.substring(1, p.length() -1));
    }
    
    String rev(String p) {
        String res = "";
        
        for (char c: p.toCharArray()) {
            if (c == '(') res += ")";
            else res += "(";
        }
        
        return res;
    }
}