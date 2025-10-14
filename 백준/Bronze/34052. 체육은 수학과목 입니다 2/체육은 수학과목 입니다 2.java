import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int time = 1500;
        
        for (int i = 0; i < 4; i++) {
        	time -= Integer.parseInt(br.readLine());
        }
        
        System.out.println(time < 0? "No": "Yes");
        br.close();
    }  
}