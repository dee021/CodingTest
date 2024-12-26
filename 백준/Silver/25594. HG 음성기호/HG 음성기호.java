import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String[] words = {"aespa", "baekjoon", "cau", "debug", "edge", "firefox", "golang", "haegang",
				"iu", "java", "kotlin", "lol", "mips", "null", "os", "python", "query", "roka",
				"solvedac", "tod", "unix", "virus", "whale", "xcode", "yahoo", "zebra"};
		int[] len = new int[26];
		for (int i = 0; i < 26; i++) len[i] = words[i].length();
		
		StringBuilder sb = new StringBuilder(br.readLine().strip());
		char c;
		int idx = 0, first;
		boolean flag = true;
		StringBuilder ans = new StringBuilder();
		while (idx < sb.length() && flag) {
			
			c = sb.charAt(idx);
			first = c - 'a';
			if (idx + len[first] <= sb.length() && sb.substring(idx, idx + len[first]).equals(words[first])) {
				ans.append(c);
				idx += len[first];
			}
			else {
				flag = false;
			}
		}

		if (flag == true) System.out.println("It's HG!\n"+ans);
		else System.out.println("ERROR!");

		br.close();
	}	
}