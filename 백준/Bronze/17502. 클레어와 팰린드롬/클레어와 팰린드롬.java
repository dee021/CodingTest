import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        
        for (int i = 0; i < n/2; i++) {
        	if (arr[i] == '?' && arr[n-1-i] == '?') {
        		arr[i] = arr[n-1-i] = 'a';
        	} else if (arr[i] == '?') arr[i] = arr[n-1-i];
        	else if (arr[n-1-i] == '?') arr[n-1-i] = arr[i];
        }
        if (n%2 == 1 && arr[n/2] == '?') arr[n/2] = 'a';
        
        for (int i = 0; i < n; i++) sb.append(arr[i]);

        System.out.println(sb);
        br.close();
    }
}