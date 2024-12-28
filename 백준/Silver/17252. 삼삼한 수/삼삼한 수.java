import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean solution(Long k) {
		if (k == 0) return false;
		Long p = 1L;
		while (p*3 <= k) p*=3;
		for (Long i = p; i > 0 && k > 0; i /= 3) {
			if (k >= i) k-=i;
		}
		if (k==0) return true;
		else return false;
	}
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Long k = Long.parseLong(br.readLine());
		
		if (solution(k)) System.out.println("YES");
		else System.out.println("NO");

		br.close();
	}	
}