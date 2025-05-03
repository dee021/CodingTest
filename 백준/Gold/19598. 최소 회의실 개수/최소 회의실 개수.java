import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> room = new PriorityQueue<>();
		
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (time1, time2) -> {
			if (time1[0] == time2[0]) return time2[1] - time2[1];
			return time1[0] - time2[0];
		});

		for (int i = 0; i < n; i++) {
			if (!room.isEmpty() && room.peek() <= arr[i][0]) room.poll();
			room.add(arr[i][1]);
		}
		
		System.out.println(room.size());
		br.close();
	}
}