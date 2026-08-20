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
        	int c = Integer.parseInt(br.readLine());
        	
        	if (c <= 1) sb.append(c < 1? "1":"0");
        	else {
        		if (c % 2 > 0) {
        			sb.append("4");
        			c--;
        		}
        		sb.append(fill8(c/2));
        	}
        	        	
    		sb.append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
    
    static String fill8(int cnt) {
    	if (cnt < 1) return "";
    	if (cnt == 1) return "8";
    	String half = fill8(cnt/2);
    	
    	if (cnt % 2 > 0) return half + half + "8";
    	return half + half;
    }
}