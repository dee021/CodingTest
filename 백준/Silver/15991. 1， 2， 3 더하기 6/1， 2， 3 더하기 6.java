import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Dp {
	int[] dp;
	final int M = 1000000009;
	
	public Dp() {
		int intArray[] = {2, 4, 6};
		
		dp = new int[100001];
		dp[0] = dp[1] = 1;
		dp[2] = dp[3] = 2;
		
		for (int i = 4; i < 100001; i++) {
			for (int j :intArray) {
				if (i >= j) {
					dp[i] += dp[i-j];
					dp[i] %= M;
				}
			}
		}
	}
	
	public int Ans(int k) {
		return dp[k];
	}
}


public class Main {
	static String ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Dp dp = new Dp(); 
		ans = "";
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++)
			ans += dp.Ans(Integer.parseInt(br.readLine())) + "\n";
		System.out.print(ans);
        br.close();
	}
}