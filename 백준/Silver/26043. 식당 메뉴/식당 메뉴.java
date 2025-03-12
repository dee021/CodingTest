import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		ArrayDeque<int[]> line = new ArrayDeque();
		ArrayList<Integer> groupA = new ArrayList(), groupB = new ArrayList(), groupC = new ArrayList();

		int menu;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			if (st.nextToken().equals("1")) line.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
			else {
				menu = Integer.parseInt(st.nextToken());
				if (menu == line.getFirst()[1]) groupA.add(line.poll()[0]);
				else groupB.add(line.poll()[0]);
			}
		}
		
		
		while (!line.isEmpty()) groupC.add(line.poll()[0]);
		
		groupA.sort(Comparator.naturalOrder());
		groupB.sort(Comparator.naturalOrder());
		groupC.sort(Comparator.naturalOrder());
		print(groupA);
		print(groupB);
		print(groupC);
		br.close();
	}
	
	private static void print(ArrayList group) {
		if (group.isEmpty()) {
			System.out.println("None");
			return ;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < group.size(); i++) sb.append(group.get(i) + " ");
		System.out.println(sb);
	}
}