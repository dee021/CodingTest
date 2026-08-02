import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
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
        	int n = Integer.parseInt(br.readLine()), min = 1_000_001, max = 0;
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int i = 0; i < n; i++) {
        		int k = Integer.parseInt(st.nextToken());
        		min = Math.min(min, k);
        		max = Math.max(max, k);
        	}
        	sb.append(String.format("#%d %d\n", t, min * max));
        }
        
        System.out.println(sb);
        br.close();
    }
}