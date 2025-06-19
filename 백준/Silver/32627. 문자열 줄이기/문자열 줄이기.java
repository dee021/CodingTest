import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int[] alpha = new int[26];
        int[][] idx = new int[26][n+1];
        char[] input = br.readLine().toCharArray(), res = new char[n];
        
        
        for (int i = 0; i < n; i++) {
        	idx[input[i] - 'a'][++alpha[input[i] - 'a']] = i;
        }
        
        Arrays.sort(input);
        
        for (int i = n-1, cnt = 0; cnt < n-m; cnt++, i--) {
        	res[idx[input[i] - 'a'][alpha[input[i] - 'a']]] = input[i];
        	alpha[input[i] - 'a']--;
        }
        
        for (int i = 0; i < n; i++) {
        	if ((int)res[i] > 0) System.out.print(res[i]);
        }
        
        br.close();
    }
}