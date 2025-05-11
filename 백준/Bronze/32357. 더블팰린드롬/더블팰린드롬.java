import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()), cnt = 0;
        while (n-- > 0) {
        	char[] input = br.readLine().toCharArray();
        	boolean flag = true;
        	for (int i = 0; i < input.length/2; i++) {
        		if (input[i] != input[input.length - 1 -i]) {
        			flag = false;
        			break;
        		}
        	}
        	if (flag) cnt++;;
        }
        
        System.out.println(cnt*(cnt-1));
        br.close();
    }
}