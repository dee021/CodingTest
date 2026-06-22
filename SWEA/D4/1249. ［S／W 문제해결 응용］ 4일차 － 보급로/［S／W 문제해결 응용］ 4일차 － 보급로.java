import java.io.FileInputStream;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayDeque;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    static int[][] d = {{0,1}, {0,-1}, {1,0}, {-1,0}};
    
	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream(&quot;res/input.txt&quot;));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        for (int i = 1; i < tc +1; i++) {
        	int n = Integer.parseInt(br.readLine());
        	int[][] arr = new int[n][n];
        	
        	for (int j = 0; j < n; j++) {
        		String line = br.readLine();
        		for (int k = 0; k < n; k++) arr[j][k] = line.charAt(k) - '0';
        	}
        	
        	sb.append(String.format("#%d %d\n", i,search(arr, n)));
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static int search(int[][] arr, int size) {
		int[][] res = new int[size][size];
		for (int i = 0; i < size; i++) Arrays.fill(res[i], 100000);
		res[0][0] = 0;
		
		ArrayDeque<int[]> ad = new ArrayDeque<>();
		ad.add(new int[] {0,0});
		
		while (!ad.isEmpty()) {
			int[] cur = ad.poll();
			for (int i = 0; i < 4; i++) {
				int r = cur[0] + d[i][0], c = cur[1] + d[i][1];
				if (r >= 0 && r < size && c >= 0 && c < size) {
					if (res[r][c] > res[cur[0]][cur[1]] + arr[r][c]) {
						res[r][c] = res[cur[0]][cur[1]] + arr[r][c];
						ad.add(new int[] {r, c});
					}
				}
			}
		}
		return res[size-1][size-1];
	}
}