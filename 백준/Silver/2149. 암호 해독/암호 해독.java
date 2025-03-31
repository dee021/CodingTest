import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String key = br.readLine();
		int[] idx = getIndex(key);
		String text = br.readLine();
		int w = key.length(), h = text.length()/w;
		for (int r = 0; r < h; r++) {
			for (int c = 0; c < w; c++) sb.append(text.charAt(idx[c]*h+r));
		}

		System.out.println(sb);
		br.close();
	}
	
	static int[] getIndex(String key) {
		ArrayList<Integer> al = new ArrayList();
		for (int c = 0; c < 26; c++) {
			al.addAll(getIndex(key, (char)(c+'A')));
		}
		
		int[] arr = new int[key.length()];
		for (int i = 0; i < key.length(); i++) arr[al.get(i)] = i;
		return arr;
	}
	
	static ArrayList<Integer> getIndex(String key, char c) {
		ArrayList<Integer> al = new ArrayList();
		for (int i = 0; i < key.length(); i++) if (key.charAt(i) == c) al.add(i);
		return al;
	}
}