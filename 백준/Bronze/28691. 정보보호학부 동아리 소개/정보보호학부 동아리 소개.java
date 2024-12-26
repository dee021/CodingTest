import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine().strip(), answer;
		
		if (s.equals("M")) answer = "MatKor";
		else if (s.equals("W")) answer = "WiCys";
		else if (s.equals("C")) answer = "CyKor";
		else if (s.equals("A")) answer = "AlKor";
		else answer = "$clear";
		System.out.println(answer);
		br.close();
	}	
}