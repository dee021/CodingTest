import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int tc = 0,n, gcd;
		String output;
		int[] res, input;
		while (true) {
			tc++;
			n = Integer.parseInt(br.readLine());
			if (n == 0)break;
			res = conv(br.readLine());
			for (int i = 1; i < n; i++) {
				input = conv(br.readLine());
				res[0] = res[0] * input[1] + res[1] * input[0];
				res[1] *= input[1]; 
				gcd = gcd(Math.max(res[0], res[1]), Math.min(res[0], res[1]));
				res[0] /= gcd; res[1] /= gcd;
			}
			sb.append("Test " + tc);
			if (res[1] == 1) output = ": "+ res[0];
			else if (res[0] > res[1]) output = ": "+res[0]/res[1]+","+res[0]%res[1]+"/"+res[1];
			else output = ": "+res[0]+"/"+res[1];
			
			sb.append(output+"\n");
		}
        
		System.out.println(sb);
		br.close();
	}
	
	static int gcd(int max, int min) {
		int tmp;
		while (min > 0) {
			max %= min;
			
			tmp = min;
			min = max;
			max = tmp;
		}
		return max;
	}
	
	static int[] conv(String input) {
		int[] res = new int[2];
		int n = 1, d = 0;
		if (input.contains(",")) {
			d = Integer.parseInt(input.split(",")[0]);
			input = input.split(",")[1];
			d *= Integer.parseInt(input.split("/")[1]);
		}
		
		if (input.contains("/"))  {
			d += Integer.parseInt(input.split("/")[0]);
			n *= Integer.parseInt(input.split("/")[1]);
		} else d = Integer.parseInt(input);
		
		res[0] = d; res[1] = n;
		return res;
	}
}