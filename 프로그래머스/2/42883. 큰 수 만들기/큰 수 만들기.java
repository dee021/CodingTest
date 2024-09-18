import java.util.Arrays;
import java.util.ArrayList;

class Solution {
	    public static String solution(String number, int k) {
	        ArrayList<Character> al = new ArrayList(number.length() - k);
	        int index = 0;
	        int cnt = 0;
	        al.add(number.charAt(0));
	        for (int i = 1; i < number.length(); i++) {
	        	char c = number.charAt(i);
	            if (al.get(index) >= c || cnt >= k) {
	                al.add(c);
	                index++;
	            } else {
	                while (al.size() > 0 && cnt < k && al.get(index) < c) {
	                    cnt++;
	                    al.remove(index--);
	                }
	                al.add(c);
	                index++;
	            }
	        }
            
            String answer = "";
            for (int i = 0; i < number.length() - k; i++) answer += al.get(i);
            return answer;
	    }
	}