import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
        
        int testcase = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= testcase; tc++) {
        	int n = Integer.parseInt(br.readLine()), ans = 0, minT, tmp;
        	int[][] arr = new int[n][2];
        	for (int i = 0; i < n; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		for (int j = 0; j < 2; j++)
        			arr[i][j] = Integer.parseInt(st.nextToken());
        	}
        	
        	Arrays.sort(arr, (e1, e2) -> {
    			if (e1[1] == e2[1]) return e2[0] - e1[0];
    			return e1[1] - e2[1];
    		}); // order by t asc , d desc
    		
        	int t = arr[0][1] - arr[0][0], l = 0;
    		for (int i = 1; i < n; i++) {
    			if (arr[i][1] - arr[i-1][1] > arr[i][0]) l +=  arr[i][1] - arr[i-1][1] - arr[i][0];
    			if (arr[i][1] - arr[i-1][1] < arr[i][0]) {
    				l += (arr[i][1] - arr[i-1][1] - arr[i][0]);
    				if (l < 0) {
    					t += l;
    					l = 0;
    				}
    			}
    		}
        	
    		sb.append(String.format("%d\n", t));
        }
        
        System.out.println(sb);
        br.close();
    }
}