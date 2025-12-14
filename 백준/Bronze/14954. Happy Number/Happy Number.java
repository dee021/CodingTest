import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();
        boolean happy = number.equals("1");
        Set<Integer> set = new HashSet<>();
        set.add(Integer.parseInt(number));
        
        while (!happy && !set.contains(number)) {
        	int res = 0;
        	for (char n: number.toCharArray()) {
        		int k = n - '0';
        		res += k*k;
        	}
        	
        	if (res == 1) {
        		happy = true;
        		break;
        	}
        	if (res == 4) break;
        	set.add(res);
        	number = String.valueOf(res);
        }
        
        System.out.println(happy? "HAPPY": "UNHAPPY");
        br.close();
    }
}