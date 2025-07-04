import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        long[] acc_arr = new long[n];
        
        st = new StringTokenizer(br.readLine(), " ");
        acc_arr[0] = Long.parseLong(st.nextToken());
        for (int i = 1; i < n; i++) acc_arr[i] = acc_arr[i-1] + Long.parseLong(st.nextToken());
        Arrays.sort(acc_arr);
        
        long res = 0;
        for (int i = n-1; i >= n-k; i--) res += acc_arr[i];
        
        System.out.println(res);
        br.close();
    }
}