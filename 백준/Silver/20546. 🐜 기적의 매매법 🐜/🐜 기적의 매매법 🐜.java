import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int  bnpCash = Integer.parseInt(br.readLine()), timingCash = bnpCash, bnpStock = 0, timingStock = 0, upAndDown = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int before = 0, cur = 0;
        
        for (int i = 0; i < 14; i++) {
        	cur = Integer.parseInt(st.nextToken());
        	
        	// bnp
        	bnpStock += bnpCash/cur;
        	bnpCash %= cur;
        	
        	if (i == 0) {
        		before = cur;
        		continue;
        	}
        	
        	// timing
        	if (before < cur) {
        		if (upAndDown >= 0) upAndDown++;
        		else upAndDown = 1;
        	} else if (before > cur) {
        		if (upAndDown <= 0) upAndDown--;
        		else upAndDown = -1;
        	} else upAndDown = 0;
        	
        	if (upAndDown == 3) {
        		timingCash += timingStock * cur;
        		timingStock = 0;
        		upAndDown--;
        	} else if (upAndDown == -3) {
        		timingStock += timingCash/cur;
        		timingCash %= cur;
        		upAndDown++;
        	}
        	
        	before = cur;
        }
        
        
        int bnpRes = bnpCash + bnpStock * cur, timingRes = timingCash + timingStock * cur;
        
        if (bnpRes == timingRes) System.out.println("SAMESAME");
        else if (bnpRes > timingRes) System.out.println("BNP");
        else System.out.println("TIMING");

        br.close();
    }
}