import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        char[] pattern = br.readLine().toCharArray();
        int[] pi = setPi(pattern);
        
        ArrayList<Character> al = new ArrayList<>();
        
        int p = 0, ans = 0;
        
        for (char c: text.toCharArray()) {
        	if (c <= '9') continue;
        	
        	while (p > 0 && c != pattern[p]) {
        		al = new ArrayList<>(al.subList(al.size() - pi[p] -1, al.size()));
        		p = pi[p-1];
        	} 
        	
        	if (c == pattern[p]) {
        		al.add(c);
        		p++;
        	}
        	
        	if (al.size() == pattern.length) {
        		ans = 1;
        		break;
        	}
        }
        
        System.out.println(ans);
        br.close();
    }
    
    static int[] setPi(char[] arr) {
    	int[] pi = new int[arr.length];
    	int p = 0;
    	
    	for (int i = 1; i < arr.length; i++) {
    		while (p > 0 && arr[i] != arr[p]) p = pi[p-1];
    		
    		if (arr[i] == arr[p]) {
    			p++;
    			pi[i] = p;
    		}
    	}
    	return pi;
    }
}