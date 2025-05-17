import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Arrays;

class Condo {
	private int dist, cost, no;
	
	public Condo (int no, int dist, int cost) {
		this.no = no;
		this.dist = dist;
		this.cost = cost;
	}
	
	public int getNo() {return this.no;}
	public int getDist() {return this.dist;}
	public int getCost() {return this.cost;}
}

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine()), cnt = 0;
        boolean[] delete = new boolean[n];
        Condo[] condo = new Condo[n];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int d = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
        	condo[i] = new Condo(i, d, c);
        }
        
        // 조건 1 검사
        Arrays.sort(condo, new Comparator<Condo>() {
        	public int compare(Condo condo1, Condo condo2) {
        		if (condo1.getDist() == condo2.getDist()) return condo1.getCost() - condo2.getCost();
        		return condo1.getDist() - condo2.getDist();
        	}
        });
        for (int i = 1; i < n; i++) {
        	for (int j = 0; j < i; j++) {
        		if (condo[i].getDist() > condo[j].getDist() && condo[i].getCost() >= condo[j].getCost()) {
        			delete[condo[i].getNo()] = true;
        			break;
        		}
        	}
        }
        
     // 조건 2 검사 + cnt 체크
        Arrays.sort(condo, new Comparator<Condo>() {
        	public int compare(Condo condo1, Condo condo2) {
        		if (condo1.getCost() == condo2.getCost()) return condo1.getDist() - condo2.getDist();
        		return condo1.getCost() - condo2.getCost();
        	}
        });
        for (int i = 1; i < n; i++) {
        	if (delete[condo[i].getNo()]) continue;
        	
        	for (int j = 0; j < i; j++) {
        		if (condo[i].getCost() > condo[j].getCost() && condo[i].getDist() >= condo[j].getDist()) {
        			delete[condo[i].getNo()] = true;
        			break;
        		}
        	}
        	
        	if (!delete[condo[i].getNo()]) cnt++;
        }
        
        if (!delete[condo[0].getNo()]) cnt++;
        System.out.println(cnt);
        br.close();
    } 
}