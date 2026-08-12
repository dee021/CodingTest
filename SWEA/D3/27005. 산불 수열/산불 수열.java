import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

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
        	int n = Integer.parseInt(br.readLine());
        	ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,1));
        	
        	for (int i = al.size(); i < n+1; i++) {
        		boolean[] num = new boolean[301];
        		for (int k = 1; k <= i/2; k++) {
        			int d = al.get(i - k) - al.get(i - 2*k);
        			
        			if (al.get(i - k) + d < 0) d = -al.get(i - k);
        			num[al.get(i - k) + d] = true;
        		}
        		for (int k = 1; k < 301; k++) 
        			if (!num[k]) {
        			al.add(k);
        			break;
        		}
        		
        		if (al.size() <= i) System.out.println("error" + i);
        	}
        	
    		sb.append(String.format("%d\n", al.get(n)));
        }
        
        System.out.println(sb);
        br.close();
    }
}