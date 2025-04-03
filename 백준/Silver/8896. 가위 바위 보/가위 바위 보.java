import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			sb.append(testCase(Integer.parseInt(br.readLine()))).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
	
	private static int testCase(int n) throws IOException {
		char[][] arr = new char[n+1][];
		int[] count;
		boolean[] robot = new boolean[n+1];
		Arrays.fill(robot, true);
		for (int i = 1; i < n+1; i++) arr[i] = br.readLine().toCharArray();
		
		ArrayList<Integer> sissor = new ArrayList<>();
		ArrayList<Integer> rock = new ArrayList<>();
		ArrayList<Integer> paper = new ArrayList<>();
		for (int rnd = 0; rnd < arr[1].length; rnd++) {
			sissor.clear();
			rock.clear();
			paper.clear();
			count = new int[3]; // {S, R, P}
			for (int rb = 1; rb < n+1; rb++) {
				if (robot[rb]) {
					switch (arr[rb][rnd]) {
						case 'S':count[0]++;sissor.add(rb);break;
						case 'R':count[1]++;rock.add(rb);break;
						case 'P':count[2]++;paper.add(rb);break;
					}
				}
			}
			if (count[0] == 0 && count[1] > 0 && count[2] > 0) {
				for (int rb : rock) robot[rb] = false;
			} else if (count[0] > 0 && count[1] == 0 && count[2] > 0) {
				for (int rb : paper) robot[rb] = false;
			} else if (count[0] > 0 && count[1] > 0 && count[2] == 0) {
				for (int rb : sissor) robot[rb] = false;
			}
		}
		int winner = 0, cnt = 0;
		for (int i = 1; i < n+1; i++) {
			if(robot[i]) {
				cnt++;
				winner = i;
				if (cnt > 1) return 0;
			}
		}
		return winner;
	}
}