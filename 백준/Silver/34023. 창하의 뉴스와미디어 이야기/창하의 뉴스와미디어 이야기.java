import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

class Word implements Comparable<Word> {
	String w;
	int l;
	
	Word(String w, int l) {
		this.w = w;
		this.l = l;
	}

	@Override
	public int compareTo(Word o) {
		return this.l - o.l;
	}
}


public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        Word[] words = new Word[n];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	String w = st.nextToken();
        	int l = Integer.parseInt(st.nextToken());
        	
        	words[i] = new Word(w, l);
        }
        
        Arrays.sort(words);
        String[][] cls = new String[4][n/4];
        
        for (int i = 0; i < 4; i++) {
        	for (int j = i; j < n; j += 4) {
        		cls[i][j/4] = words[j].w;
        	}
        	
        	Arrays.sort(cls[i]);
        	sb.append(i+1).append(" ");
        	for (int j = 0; j < n/4; j++) sb.append(cls[i][j]).append(" ");
        	sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}