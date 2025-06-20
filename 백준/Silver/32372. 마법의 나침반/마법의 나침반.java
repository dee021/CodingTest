import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int minR = 0, maxR = n+1, minC = 0, maxC = n+1;
        
        while (m-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
        	switch(d) {
        	case 1:
        		maxR = Math.min(maxR, r-1);
        		minR = Math.min(minR, maxR);
        		minC = maxC = c;
        		break;
        	case 2:
        		maxR = Math.min(maxR, r-1);
        		minR = Math.min(minR, maxR);
        		minC = Math.max(minC, c+1);
        		maxC = Math.max(maxC, minC);
        		break;
        	case 3:
        		minR = maxR = r;
        		minC = Math.max(minC, c+1);
        		maxC = Math.max(maxC, minC);
        		break;
        	case 4:
        		minR = Math.max(minR, r+1);
        		maxR = Math.max(minR, maxR);
        		minC = Math.max(minC, c+1);
        		maxC = Math.max(maxC, minC);
        		break;
        	case 5:
        		minR = Math.max(minR, r+1);
        		maxR = Math.max(minR, maxR);
        		minC = maxC = c;
        		break;
        	case 6:
        		minR = Math.max(minR, r+1);
        		maxR = Math.max(minR, maxR);
        		maxC = Math.min(maxC, c-1);
        		minC = Math.min(maxC, minC);
        		break;
        	case 7:
        		minR = maxR = r;
        		maxC = Math.min(maxC, c-1);
        		minC = Math.min(maxC, minC);
        		break;
        	case 8:
        		maxR = Math.min(maxR, r-1);
        		minR = Math.min(minR, maxR);
        		maxC = Math.min(maxC, c-1);
        		minC = Math.min(maxC, minC);
        		break;
        	}
        	if (minR == maxR && minC == maxC) break;
        }
        
        int r = (minR + maxR)/2, c = (minC + maxC)/2;
        if (r == 0) r++; if (c == 0) c++;
        
        System.out.println(r + " " + c);
        br.close();
    }
}