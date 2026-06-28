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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= tc; i++) {
        	int n = Integer.parseInt(br.readLine()), max = 1, room = n*n;
        	int[] arr = new int[n*n +1], cnt = new int[n*n +1];
        	cnt[n*n] = 1;
        	
        	for (int j = 0; j < n*n; j++) {
        		if (j % n == 0) st = new StringTokenizer(br.readLine(), " ");
        		arr[Integer.parseInt(st.nextToken())] = j;
        	}
        	
        	for (int j = n*n -1; j > 0; j--) {
        		if (Math.abs(arr[j] - arr[j+1]) == n) { 
        			cnt[j] = cnt[j+1] +1;
        		} else if (arr[j] +1 == arr[j+1] && arr[j+1] % n > 0) cnt[j] = cnt[j+1] +1;
        		else if (arr[j]== arr[j+1] +1 && arr[j] % n > 0) cnt[j] = cnt[j+1] +1;
        		else cnt[j] = 1;
        		
        		if (max <= cnt[j]) {
        			max = cnt[j];
        			room = j;
        		}
        	}
        	
        	sb.append(String.format("#%d %d %d\n", i, room, max));
        }
        
        System.out.println(sb);
        br.close();
	}
}