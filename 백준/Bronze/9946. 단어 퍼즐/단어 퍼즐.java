import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = 0;
        
        while (true) {
        	String str1 = br.readLine(), str2 = br.readLine();
        	if (str1.equals("END")) break;
        	t++;
        	int[] cnt = new int[26];
        	boolean flag = true;
        	
        	for (char c: str1.toCharArray()) cnt[c - 'a']++;
        	for (char c: str2.toCharArray()) cnt[c - 'a']--;
        	
        	for (int c: cnt) if (c != 0) {
        		flag = false;
        		break;
        	}
        	if (flag) sb.append(String.format("Case %d: same\n", t));
        	else sb.append(String.format("Case %d: different\n", t));
        }
        
        System.out.print(sb);
        br.close();
    }
}