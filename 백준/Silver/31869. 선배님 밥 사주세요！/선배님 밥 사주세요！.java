import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		Map<String, String[]> students = new HashMap();
		int n = Integer.parseInt(br.readLine());
		String[] inputs = new String[4];

		for (int i = 0; i < n; i++) {
			inputs = br.readLine().strip().split(" ");
			students.put(inputs[0], Arrays.copyOfRange(inputs, 1, 4));
			}
		
		int[][] cal = new int[11][7];
		int[] tmp;
		inputs = new String[2];
		for (int i = 0; i < n; i++) {
			inputs = br.readLine().strip().split(" ");
			tmp = Arrays.stream(students.get(inputs[0])).mapToInt(Integer::parseInt).toArray();
			if (Integer.parseInt(inputs[1]) < tmp[2]) students.remove(inputs[0]);
			else cal[tmp[0]][tmp[1]] = 1;
		}
		
		int ans = 0;
		int flag = 0;
		int cnt = 0;
		for (int w = 1; w < 11; w++) {
			for (int d = 0; d < 7; d++) {
				if (cal[w][d] == 1) {
					if (flag == 0) flag++;
					cnt++;
					ans = Math.max(ans, cnt);
				}
				else if (flag == 1) {
					flag = 0;
					cnt = 0;
				}
			}
		}
		System.out.println(ans);
	}
}