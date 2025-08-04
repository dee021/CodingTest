import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> s = new HashSet<>();
        
        for (int i = 0; i < 5; i++) {
        	int n = Integer.parseInt(br.readLine());
        	if (s.contains(n)) s.remove(n);
        	else s.add(n);
        }
        
        System.out.println(s.toArray()[0]);
        
        br.close();
    } 
}