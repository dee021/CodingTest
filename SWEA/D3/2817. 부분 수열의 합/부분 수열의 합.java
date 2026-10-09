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
        
        int tc = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= tc; t++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        	int[] arr = new int[n];
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int i = 0; i < n; i++) {
        		arr[i] = Integer.parseInt(st.nextToken());
        	}
        	
        	int res = bruteForce(arr, n, k, 0, 0);
        	sb.append(String.format("#%d %d\n", t, res));
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static int bruteForce(int[] arr, int size, int k, int idx, int sum) {
    	if (k == sum) {
    		return 1;
    	} else if (k < sum) return 0;
    	
    	if (idx >= size) return 0;
    	
    	int res = 0;
    	res += bruteForce(arr, size, k, idx+1, sum);
    	res += bruteForce(arr, size, k, idx+1, sum + arr[idx]);
    	
    	return res;
    }
}