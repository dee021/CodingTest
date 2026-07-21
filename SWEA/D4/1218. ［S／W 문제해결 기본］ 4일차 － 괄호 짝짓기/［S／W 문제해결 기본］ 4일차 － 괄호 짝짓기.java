import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        map.put('>', '<');
        
        for (int t = 1; t <= 10; t++) {
        	int n = Integer.parseInt(br.readLine());
        	String input = br.readLine();
        	ArrayDeque<Character> ad = new ArrayDeque<>();
        	
        	for (char c:input.toCharArray()) {
        		if (ad.isEmpty() || "([{<".contains(String.valueOf(c))) {
        			ad.add(c);
        		} else if (ad.peekLast() == map.get(c)) ad.pollLast();
        		else ad.add(c);
        		
        	}
        	sb.append(String.format("#%d %d\n", t, ad.size() > 0? 0: 1));
        }
        
        System.out.println(sb);
        br.close();
    }
}