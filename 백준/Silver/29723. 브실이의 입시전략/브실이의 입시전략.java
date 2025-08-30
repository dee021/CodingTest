import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        Map<String, Integer> subject = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	subject.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }
        
        int s = 0;
        for (int i = 0; i < k; i++) {
        	s += subject.remove(br.readLine());
        }
        int[] res = minAndMax(m-k, subject);
        
        System.out.println((s+res[0]) + " " + (s + res[1]));
        br.close();
    }
    
    static int[] minAndMax(int cnt, Map<String, Integer> subject) {
    	int[] score = new int[subject.size()];
    	int idx = 0;
    	
    	for (String s: subject.keySet()) {
    		score[idx++] = subject.get(s);
    	}
    	
    	Arrays.sort(score);
    	
    	int min = 0, max = 0;
    	for (int i = 0; i < cnt; i++) {
    		min += score[i];
    		max += score[score.length - i - 1];
    	}
    	
    	return new int[] {min, max};
    }
}