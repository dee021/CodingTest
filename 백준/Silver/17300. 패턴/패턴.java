import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] num = new int[10];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int pre = Integer.parseInt(st.nextToken()), cur;
		num[pre]++;
		String ans = "YES";
		for (int i = 1; i < n; i++) {
			cur = Integer.parseInt(st.nextToken());
			if (num[cur] > 0) {
				ans = "NO";
				break;
			} else if (pre%3 == 0 && pre - cur == 2 && num[cur+1] == 0) { // pre 3열, cur 1열
				ans = "NO";
				break;
			} else if (cur%3 == 0 && cur - pre == 2 && num[cur-1] == 0) {
				ans = "NO";
				break;
			} else if(cur < 4 && pre == cur + 6 && num[cur+3] == 0) {
				ans = "NO";
				break;
			} else if(pre < 4 && pre + 6 == cur && num[pre+3] == 0) {
				ans = "NO";
				break;
			} else if (((Math.abs(cur-pre) == 8) || (cur == 3 && pre == 7) || (cur == 7 && pre == 3)) && num[5] == 0) {
				ans = "NO";
				break;
			}
			num[cur]++;
			pre = cur;
		}
		
		System.out.println(ans);
		br.close();
	}
}