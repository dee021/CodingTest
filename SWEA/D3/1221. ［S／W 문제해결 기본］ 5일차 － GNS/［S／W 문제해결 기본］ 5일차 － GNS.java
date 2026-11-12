import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
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
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int[] arr;
        Map<String, Integer> strToInt = new HashMap<>();
        Map<Integer, String> intToStr = new HashMap<>();
        st = new StringTokenizer("ZRO ONE TWO THR FOR FIV SIX SVN EGT NIN", " ");
        
        for (int i = 0; i < 10; i++) {
        	String tmp = st.nextToken();
        	strToInt.put(tmp, i);
        	intToStr.put(i, tmp);
        }
        
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	sb.append(st.nextToken()).append("\n");
        	arr = new int[10];
        	st = new StringTokenizer(br.readLine(), " ");
        	
        	while (st.hasMoreTokens()) {
        		arr[strToInt.get(st.nextToken())]++;
        	}
        	
        	for (int i = 0; i < 10; i++) {
        		while (arr[i]-- > 0) sb.append(intToStr.get(i)).append(" ");
        	}
        	sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
        
    }
}