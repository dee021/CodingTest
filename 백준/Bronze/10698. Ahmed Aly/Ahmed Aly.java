import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= tc; i++) {
        	sb.append("Case ").append(i);
        	String[] oper = br.readLine().split(" ");
        	if (oper[1].equals("+")) {
        		int a = Integer.parseInt(oper[0]) + Integer.parseInt(oper[2]);
        		if (a == Integer.parseInt(oper[4])) sb.append(": YES\n");
        		else sb.append(": NO\n");
        	} else {
        		int a = Integer.parseInt(oper[0]) - Integer.parseInt(oper[2]);
        		if (a == Integer.parseInt(oper[4])) sb.append(": YES\n");
        		else sb.append(": NO\n");
        	}
        }
        
        System.out.print(sb);
        
        br.close();
    }
}