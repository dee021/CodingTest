import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        boolean[][][] number = {
        		// 0
        		{
        			{true, true, true}, // line0
        			{true, false, true}, // line1
        			{true, false, true},
        			{true, false, true},
        			{true, true, true},
        		},
        		
        		// 1
        		{
        			{false, false, true},
        			{false, false, true},
        			{false, false, true},
        			{false, false, true},
        			{false, false, true},
        		}, 
        		
        		// 2
        		{
        			{true, true, true},
        			{false, false, true},
        			{true, true, true},
        			{true, false, false},
        			{true, true, true}
        		},
        		
        		// 3
        		{
        			{true, true, true},
        			{false, false, true},
        			{true, true, true},
        			{false, false, true},
        			{true, true, true}
        		},
        		
        		// 4
        		{
        			{true, false, true},
        			{true, false, true},
        			{true, true, true},
        			{false, false, true},
        			{false, false, true},
        		}, 
        		
        		// 5
        		{
        			{true, true, true},
        			{true, false, false},
        			{true, true, true},
        			{false, false, true},
        			{true, true, true}
        		},
        		
        		// 6
        		{
        			{true, true, true},
        			{true, false, false},
        			{true, true, true},
        			{true, false, true},
        			{true, true, true}
        		},
        		
        		// 7
        		{
        			{true, true, true},
        			{false, false, true},
        			{false, false, true},
        			{false, false, true},
        			{false, false, true},
        		}, 
        		
        		// 8
        		{
        			{true, true, true},
        			{true, false, true},
        			{true, true, true},
        			{true, false, true},
        			{true, true, true}
        		},
        		
        		// 9 
        		{
        			{true, true, true},
        			{true, false, true},
        			{true, true, true},
        			{false, false, true},
        			{true, true, true}
        		}
        };
        
        boolean[][] delete = new boolean[4][10];
        
        for (int line = 0; line < 5; line++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int time = 0; time < 4; time++) {
        		String t = st.nextToken();
        		for (int num = 0; num < 10; num++) {
        			if (delete[time][num]) continue;
        			 for (int col = 0; col < 3; col++) {
        				if (t.charAt(col) == '#' && !number[num][line][col]) {
        					delete[time][num] = true;
        					break;
        				}
        			}
        		}
        	}
        }
        
        for (int time = 0; time < 4; time++) {
        	for (int num = 0; num < 10; num++) {
        		if (!delete[time][num]) {
        			sb.append(num);
        			break;
        		}
        	}
        }
        sb.insert(2, ':');
        System.out.println(sb);
        br.close();
    } 
}