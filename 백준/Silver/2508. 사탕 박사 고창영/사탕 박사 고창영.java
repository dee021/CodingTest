import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        
        while (tc-- > 0) {
        	br.readLine();
        	st = new StringTokenizer(br.readLine(), " ");
        	int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), cnt = 0;
        	char[][] arr = new char[r][];
        	
        	for (int i = 0; i < r; i++) arr[i] = br.readLine().toCharArray();
        	
        	for (int i = 0; i < r; i++) {
        		for (int j = 0; j < c; j++) {
        			if (arr[i][j] == 'o' && check(arr, r, c, i, j)) cnt++;
        		}
        	}
        	sb.append(cnt).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static boolean check(char[][] arr, int r, int c, int i, int j) {
    	if (0 < i && i < r-1) {
    		if (arr[i-1][j] == 'v' && arr[i+1][j] == '^') return true;
    	}
        if (0 < j && j < c-1) {
    		if (arr[i][j-1] == '>' && arr[i][j+1] == '<') return true;
    	}
    	return false;
    }
}