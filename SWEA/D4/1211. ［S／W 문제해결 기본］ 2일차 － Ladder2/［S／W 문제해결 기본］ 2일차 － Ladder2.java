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
        
        int[][] arr = new int[100][100];
        
        for (int t = 1; t <= 10; t++) {
        	int tc = Integer.parseInt(br.readLine()), min = 100_000, ans = -1;
        	
        	for (int i = 0; i < 100; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		for (int j = 0; j < 100; j++) {
        			arr[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
        	
        	for (int i = 0; i < 100; i++) {
        		if (arr[0][i] > 0) {
        			int dis = ladder(i, arr);
        			if (dis <= min) {
        				min = dis;
        				ans = i;
        			}
        		}
        	}
        	
        	sb.append(String.format("#%d %d\n", tc, ans));
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static int ladder(int idx, int[][] arr) {
    	int res = 0, row = 0;
    	
    	while (row < 99) {
    		row++;res++;
    		if (idx > 0 && arr[row][idx-1] > 0) {
    			while (idx > 0 && arr[row][idx-1] > 0) {
    				idx--;
    				res++;
    			}
    		}else if (idx < 99 && arr[row][idx+1] > 0) {
    			while (idx < 99 && arr[row][idx+1] > 0) {
    				idx++;res++;
    			}
    		}
    	}
    	
    	return res;
    }
    
}