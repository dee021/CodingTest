import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        boolean isOdd = false;
        char[] isbn = br.readLine().toCharArray();
        int res = 0;
        
        for (int i = 0; i < 13; i++) {
        	if (isbn[i] == '*') isOdd = i%2 == 1; // true -> 3*k
        	else if (i%2 == 0) res += isbn[i] - '0';
        	else res += (isbn[i] - '0') * 3;
        }
        
        for (int i = 0; i < 10; i++) {
        	if (isOdd) {
        		if ((res + i*3) %10 == 0) {
        			System.out.println(i);
        			break;
        		}
        	}else {
        		if ((res + i) %10 == 0) {
        			System.out.println(i);
        			break;
        		}
        	}
        }
        
        br.close();
    }
}