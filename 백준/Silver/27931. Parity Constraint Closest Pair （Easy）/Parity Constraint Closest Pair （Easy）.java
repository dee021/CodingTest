import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()), evenGap = Integer.MAX_VALUE, oddGap = Integer.MAX_VALUE, even = Integer.MAX_VALUE, odd = Integer.MAX_VALUE;
        int[] arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(arr);
        
        boolean o = false, e = false;
        if (arr[0] % 2 == 0) {
        	even = arr[0];
        	e = true;
        } else {
        	odd = arr[0];
        	o = true;
        }
        
        for (int i = 1; i < n; i++) {
        	if (e) {
        		int g = arr[i] - even;
        		if (g % 2 == 0) evenGap = Math.min(evenGap, g);
        		else oddGap = Math.min(oddGap, g);
        	} 
        	
        	if (o) {
        		int g = arr[i] - odd;
        		if (g % 2 == 0) evenGap = Math.min(evenGap, g);
        		else oddGap = Math.min(oddGap, g);
        	}
        	
        	if (arr[i] % 2 == 0) {
        		even = arr[i];
            	e = true;
        	} else {
        		odd = arr[i];
            	o = true;
        	}
        }
        
        if (evenGap == Integer.MAX_VALUE) evenGap = -1;
        if (oddGap == Integer.MAX_VALUE) oddGap = -1;
        
        System.out.println(evenGap + " " + oddGap);
        br.close();
    }
}