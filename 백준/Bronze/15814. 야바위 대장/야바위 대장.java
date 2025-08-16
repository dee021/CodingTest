import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        char[] input = br.readLine().toCharArray();
        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int idx1 = Integer.parseInt(st.nextToken()), idx2 = Integer.parseInt(st.nextToken());
        	swap(input, idx1, idx2);
        }
        
        for (int i = 0; i < input.length; i++) System.out.print(input[i]);

        br.close();
    }
    
    static void swap(char[] arr, int idx1, int idx2) {
    	char c = arr[idx1];
    	arr[idx1] = arr[idx2];
    	arr[idx2] = c;
    }
}