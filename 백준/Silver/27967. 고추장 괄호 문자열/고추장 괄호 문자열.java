import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Main {
	static StringBuilder ans = new StringBuilder();
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine()), o = n/2;
        char[] input = br.readLine().toCharArray();
        
        for (int i = 0; i < n; i++) {
        	if (input[i] == '(') o--;
        }
        
        bf(0, o, input, new boolean[n]);
        
        System.out.println(ans);
        
        br.close();
    }
    
    static boolean bf(int idx, int cnt, char[] arr, boolean[] visited) {
    	if (cnt == 0) {
    		return check(arr, visited);
    	}
    	
    	for (int i = idx; i < arr.length; i++) {
    		if (arr[i] == 'G') {
    			visited[i] = true;
    			if (bf(i+1, cnt-1, arr, visited)) {
    				return true;
    			}
    			visited[i] = false;
    		}
    	}
    	return false;
    }
    
    static boolean check(char[] arr, boolean[] visited) {
    	StringBuilder tmp = new StringBuilder();
    	ArrayList<Character> al = new ArrayList<>();
    	
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] == '(') {
    			al.add('(');
    			tmp.append('(');
    		}
    		else if (arr[i] == 'G' && visited[i]) {
    			al.add('(');
    			tmp.append('(');
    		}
    		else { // ')'
    			tmp.append(')');
    			if (!al.isEmpty() && al.remove(al.size()-1) == '(') continue;
    			else return false;
    		}
    	}
    	
    	if (al.isEmpty()) ans.append(tmp.toString());
    	
    	return al.isEmpty();
    }
}