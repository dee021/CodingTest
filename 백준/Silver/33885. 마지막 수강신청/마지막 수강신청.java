import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Set;
import java.util.HashSet;

class Subject {
	int c;
	Set<String> time = new HashSet<>();
	
	public Subject(int c) {
		this.c = c;
	}
	
	public void addTime(String day, int hour) {
		time.add(day + hour);
	}
}

public class Main {
	static int n, m;
	static Subject[] subject;
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken()); m = Integer.parseInt(st.nextToken());
        subject = new Subject[n];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	subject[i] = new Subject(Integer.parseInt(st.nextToken()));
        	
        	int s = Integer.parseInt(st.nextToken());
        	while (s-- > 0) {
        		subject[i].addTime(st.nextToken(), Integer.parseInt(st.nextToken()));
        	}
        }
        
        boolean res = bf(new HashSet<>(), -1, 0);
        
        System.out.println(res? "YES": "NO");
        

        br.close();
    }
    
    
    static boolean bf(Set<String> table, int idx, int res) {
    	
    	Set<String> timetable = new HashSet<>();

    	if (idx > -1) {
    		
    		for (String time : subject[idx].time) {
    			if (!table.contains(time)) timetable.add(time);
    			else return false;
    		}
    		
    		table.addAll(timetable);
    		res += subject[idx].c;
    	}

    	if (res >= m) return true;
    	

    	for (int i = idx+1; i < n; i++) {
    		if (bf(table, i, res)) return true;
    	}
    	
    	table.removeAll(timetable);
    	return false;
    }
}