import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			switch(br.readLine().charAt(0)) {
			case 'k':arr[0] = 1; break;
			case 'l':arr[1] = 1; break;
			case 'p': arr[2] = 1; break;
			}
		}
		
		System.out.println(arr[0] + arr[1] + arr[2] == 3?"GLOBAL":"PONIX");
		br.close();
	}
}