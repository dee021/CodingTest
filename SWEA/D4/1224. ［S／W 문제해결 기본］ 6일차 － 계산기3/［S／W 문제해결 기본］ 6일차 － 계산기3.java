import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        for (int t = 1; t <= 10; t++) {
        	int n = Integer.parseInt(br.readLine());
        	String input = br.readLine();
        	
        	int ans = calc(input, n, 0)[1];
    		sb.append(String.format("#%d %d\n", t, ans));
        }
        
        System.out.println(sb);
        
        br.close();
    }
    
    static int[] calc(String oper, int n, int idx) {
    	ArrayDeque<Integer> ad = new ArrayDeque<>();
    	boolean isMul = false;
    	
    	for (int i = idx; i < n; i++) {
    		char c = oper.charAt(i);
    		
    		if (c == '(') {
    			int[] res = calc(oper, n, i+1);
    			i = res[0];
    			if (isMul) ad.add(ad.pollLast() * res[1]);
    			else ad.add(res[1]);
    		} else if (c == ')') return new int[] {i, sum(ad)};
    		else if (c == '+') {isMul = false;}
    		else if (c == '*') {isMul = true;}
    		else { // digit
    			if (isMul) ad.add(ad.pollLast() * (c - '0'));
    			else ad.add(c - '0');
    		}
    	}
    	
    	return new int[] {0, sum(ad)};
    }
    
    static int sum(ArrayDeque<Integer> ad) {
    	int res = 0;
    	for (int k: ad) res += k;
    	return res;
    }
}