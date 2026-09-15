import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayDeque;

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
        
        ArrayDeque<Integer> ad;
        int cycle = 1+2+3+4+5;
        
        for (int t = 1; t <= 10; t++) {
        	ad = new ArrayDeque<>();
        	br.readLine();
        	st = new StringTokenizer(br.readLine(), " ");
        	int m = Integer.MAX_VALUE;
        	for (int i = 0; i < 8; i++) {
        		int tmp = Integer.parseInt(st.nextToken());
        		ad.add(tmp);
        		m = Math.min(m, tmp/cycle);
        	}
        	
        	if (m > 1) for (int i = 0; i < 8; i++) {
        		ad.add(ad.poll() - (cycle * (m-1)));
        	}
        	
        	m = 1;
        	while (true) {
        		int tmp = ad.poll() - m;
        		if (tmp <= 0) {
        			ad.add(0);
        			break;
        		}
        		ad.add(tmp);
        		m++;
        		if (m > 5) m = 1;
        	}
        	
        	sb.append("#" + t);
        	for (int i = 0; i < 8; i++) sb.append(" " + ad.poll());
        	sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}