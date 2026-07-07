import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
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

        int tc = Integer.parseInt(br.readLine());
        for (int i = 1; i <= tc; i++) {
        	int n = Integer.parseInt(br.readLine());
        	int[][]arr = new int[n][2];
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j = 0; j < n; j++) {
        		arr[j][0] = Integer.parseInt(st.nextToken());
        		arr[j][1] = Integer.parseInt(st.nextToken());
        	}
        	
        	sb.append(String.format("#%d %s\n", i, bfs(n, arr)));
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static String bfs(int n, int[][] arr) {
		StringBuilder sb = new StringBuilder();
		ArrayDeque<int[]> ad = new ArrayDeque<>();
		int[] temp = new int[n+1];
		temp[0] = 1;
		
		ad.add(temp.clone());
		
		for (int i = 1; i < n; i++) {
			temp[i-1] = 0;
			temp[i] = 1;
			temp[n] = i;
			ad.add(temp.clone());
		}
		
		while (!ad.isEmpty()) {
			int[] cur = ad.poll();
			int idx = cur[n];
			
			for (int i = 0; i < n; i++) {
				if (cur[i] > 0) continue;
				if (arr[idx][1] == arr[i][0]) {
					cur[i] = cur[idx] +1;
					cur[n] = i;
					ad.add(cur.clone());
					cur[i] = 0;
					cur[n] = idx;
				}
			}
			
			if (ad.isEmpty()) {
				sb.append(order(cur, arr));
			}
		}
		
		return sb.toString();
	}
	
	static String order(int[]cur, int[][] arr) {
		StringBuilder sb = new StringBuilder();
		int[] res = new int[arr.length * 2];
		for (int i = 0; i < cur.length -1; i++) {
			if (cur[i] > 0) {
				int o = cur[i] -1;
				res[o * 2] = arr[i][0];
				res[o * 2 + 1] = arr[i][1];
			}
		}
		
		for (int l:res) {
			if (l == 0) break;
			sb.append(l).append(" ");
		}
		
		return sb.toString();
	}
}