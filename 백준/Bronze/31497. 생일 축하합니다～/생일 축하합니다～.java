import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String[] name = new String[n];
		for (int i = 0; i < n; i++) name[i] = br.readLine();

		String ans = "";
		while (ans.isEmpty()) {
			for (String nm:name) {
				System.out.println("? " +nm);
				System.out.flush();
                String res = br.readLine();
				if (res.equals("1")) {
					ans = nm;
					break;
				}
			}
		}
		
		System.out.println("! " + ans);
		System.out.flush();
		br.close();
	}
}