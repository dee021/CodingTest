import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tc; t++) {
        	String input = br.readLine(); // length <= 100,000
        	int stick = 0, ans = 0;
        	
        	for (int i = 0; i < input.length(); i++) {
        		if (input.charAt(i) == '(') stick++;
        		else if (input.charAt(i-1) == '(') {
        			stick--;
        			ans += stick;
        		} else {
        			stick--;
        			ans++;
        		}
        	}
    		sb.append(String.format("#%d %d\n", t,  ans));
        }
        
        System.out.println(sb);
        br.close();
    }
}