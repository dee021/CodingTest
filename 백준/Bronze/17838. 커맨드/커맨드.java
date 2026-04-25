import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        String ptn = "1122122";
        while (tc-- > 0) {
        	int[] chToInt = new int[26];
        	int elem = 0;
        	
        	String cmd = br.readLine(), cmdToInt = "";
        	
        	if (cmd.length() == 7) {
        		for (int i = 0; i < 7; i++) {
        			int idx = cmd.charAt(i) - 'A';
        			if (chToInt[idx] < 1) chToInt[idx] = ++elem;
        			cmdToInt += chToInt[idx];
        		}
        	}
        	sb.append(ptn.equals(cmdToInt)? 1: 0).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}