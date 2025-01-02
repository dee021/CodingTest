import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static char[] birth;
	
	static int getBiorhythm(char[] coding) {
		int y = 0, m = 0, d = 0, k;
		for (int i = 0; i < 4; i++) {
			k = birth[i] - coding[i];
			y += k*k;
		}
		for (int i = 4; i < 6; i++) {
			k = birth[i] - coding[i];
			m += k*k;
		}
		for (int i = 6; i < 8; i++) {
			k = birth[i] - coding[i];
			d += k*k;
		}
		return y*m*d;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		birth = br.readLine().strip().toCharArray();
		int maxBiorhythm = 0, biorhythm = 0, n = Integer.parseInt(br.readLine());
		char[] answer = new char[8], coding = new char[8];

		for (int i = 0; i < n; i++) {
			coding = br.readLine().strip().toCharArray();
			biorhythm = getBiorhythm(coding);
			if (biorhythm > maxBiorhythm) {
				maxBiorhythm = biorhythm;
				answer = coding;
			} else if (biorhythm == maxBiorhythm) {
				for (int j = 0; j < 8; j++) {
					if (answer[j] > coding[j]) {
						answer = coding;
						break;
					}
				}
			}
		}
		
		System.out.println(String.copyValueOf(answer));

		br.close();
	}	
}