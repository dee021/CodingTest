import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Map<String, Integer> sToI = new HashMap<>();
        String[] number = new String[16];
        number[0] = "{}"; number[1] = "{{}}";
        sToI.put("{}", 0);
        sToI.put("{{}}", 1);
        for (int i = 2; i < 16; i++) {
        	number[i] = number[i-1].substring(0, number[i-1].length()-1) + "," + number[i-1] + "}";
        	sToI.put(number[i], i);
        }
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
        	String num1 = br.readLine(), num2 = br.readLine();
        	int res = sToI.get(num1) + sToI.get(num2);
        	sb.append(number[res]).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}