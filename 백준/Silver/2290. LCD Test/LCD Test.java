import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		StringBuilder sb = new StringBuilder(), line = new StringBuilder();
		char[][][] number = {
				{ // 0
					{' ', '-', ' '},
					{'|', ' ', '|'},
					{' ', ' ', ' '},
					{'|', ' ', '|'},
					{' ', '-', ' '}
				},
				{ // 1
					{' ', ' ', ' '},
					{' ', ' ', '|'},
					{' ', ' ', ' '},
					{' ', ' ', '|'},
					{' ', ' ', ' '}
				},
				{ // 2
					{' ', '-', ' '},
					{' ', ' ', '|'},
					{' ', '-', ' '},
					{'|', ' ', ' '},
					{' ', '-', ' '}
				},
				{ // 3
					{' ', '-', ' '},
					{' ', ' ', '|'},
					{' ', '-', ' '},
					{' ', ' ', '|'},
					{' ', '-', ' '}
				},
				{ // 4
					{' ', ' ', ' '},
					{'|', ' ', '|'},
					{' ', '-', ' '},
					{' ', ' ', '|'},
					{' ', ' ', ' '}
				},
				{ // 5
					{' ', '-', ' '},
					{'|', ' ', ' '},
					{' ', '-', ' '},
					{' ', ' ', '|'},
					{' ', '-', ' '}
				},
				{ // 6
					{' ', '-', ' '},
					{'|', ' ', ' '},
					{' ', '-', ' '},
					{'|', ' ', '|'},
					{' ', '-', ' '}
				},
				{ // 7
					{' ', '-', ' '},
					{' ', ' ', '|'},
					{' ', ' ', ' '},
					{' ', ' ', '|'},
					{' ', ' ', ' '}
				},
				{ //8
					{' ', '-', ' '},
					{'|', ' ', '|'},
					{' ', '-', ' '},
					{'|', ' ', '|'},
					{' ', '-', ' '}
				}, 
				{ //9
					{' ', '-', ' '},
					{'|', ' ', '|'},
					{' ', '-', ' '},
					{' ', ' ', '|'},
					{' ', '-', ' '}
				}
		};
		
		int s = Integer.parseInt(st.nextToken());
		String n = st.nextToken();
		int[] num = new int[n.length()];
		for (int i = 0; i < n.length(); i++) {
            num[i] = n.charAt(i) - '0';
        }

		for (int r = 0; r < 5; r++) {
			line.setLength(0);
			for (int k:num) {
				line.append(number[k][r][0]);
				for (int c = 0; c < s; c++) line.append(number[k][r][1]);
				line.append(number[k][r][2]).append(" ");
			}
			line.append("\n");
			switch (r%2){
			case 0: {
                sb.append(line);
                break;
            }
            case 1: {
                for (int i = 0; i < s; i++) sb.append(line);
                break;
                }
			}
		}

		System.out.println(sb);
		br.close();
	}
}