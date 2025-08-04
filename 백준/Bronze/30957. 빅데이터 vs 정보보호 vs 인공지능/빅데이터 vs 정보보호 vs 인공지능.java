import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] bsa = new int[3];
        
        for (char c: br.readLine().toCharArray()) {
        	switch (c) {
        	case 'B':bsa[0]++;break;
        	case 'S':bsa[1]++;break;
        	case 'A':bsa[2]++;break;
        	}
        }
        
        int max = Arrays.stream(bsa).max().getAsInt();
        String ans = "";
        for (int i = 0; i < 3; i++) {
        	if (bsa[i] == max) ans += "BSA".charAt(i); 
        }
        
        if (ans.length() == 3) ans = "SCU";
        System.out.println(ans);
        
        br.close();
    }
}