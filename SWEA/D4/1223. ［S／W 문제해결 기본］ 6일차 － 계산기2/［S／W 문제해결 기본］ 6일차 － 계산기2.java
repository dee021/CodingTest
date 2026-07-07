import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        
        for (int i = 1; i <= 10; i++) {
        	br.readLine();
        	st = new StringTokenizer(br.readLine(), "+");
        	int ans = 0;
        	while (st.hasMoreTokens()) {
        		ans += calc(st.nextToken());
        	}
        	
        	sb.append(String.format("#%d %d\n", i, ans));
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static int calc(String oper) {
		int res = 1;
		
		for (char c: oper.toCharArray()) {
			if (c == '*') continue;
			res *= c - '0';
		}
		
		return res;
	}
}