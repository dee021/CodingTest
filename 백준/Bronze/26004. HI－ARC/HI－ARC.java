import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()), min = 100_000;
        int[] cnt = new int[26];
        
        for (char c: br.readLine().toCharArray()) cnt[c-'A']++;
        
        for (char c: "HIARC".toCharArray()) min = Math.min(min, cnt[c-'A']);
        
        System.out.println(min);
        br.close();
    }	
}