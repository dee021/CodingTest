import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = input.length, cnt = 0;
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(input[i]);
        Arrays.sort(arr);
        
        int s = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n-1; i++) {
        	for (int j = i+1; j < n; j++) {
        		if (arr[i] + arr[j] == s) {
        			cnt++;
        			System.out.println(arr[i] + " " + arr[j]);
        			break;
        		}
        	}
        }

        System.out.println(cnt);
        
        br.close();
    }
}