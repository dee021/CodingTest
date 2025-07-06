import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), answer = 0;
        int[] priority = new int[m+1];
        ArrayDeque<Integer[]> ad = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int p = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
        	priority[p]++;
        	ad.add(new Integer[] {p, w});
        }
        
        for (int i = m; i > 0; i--) {
        	ArrayList<Integer> list = new ArrayList<>();
        	while (priority[i] > 0) {
        		Integer[] arr = ad.poll();
        		if (arr[0] != i) {
        			answer += arr[1];
        			ad.add(arr);
        			continue;
        		}
        		priority[i]--;
        		if (!list.isEmpty() && arr[1] > list.get(list.size()-1)) {
        			int w = 0, flag = 0;
        			
        			for (int j = list.size()-1; j > 0; j--) {
                        w += list.get(j);
        				if (list.get(j) < arr[1] && arr[1] <= list.get(j-1)) {
        					answer += w*2 + arr[1];
        					list.add(j, arr[1]);
        					flag = 1;
        					break;
        				}
        			}
        			if (flag == 0) {
        				answer += (w + list.get(0)) * 2 + arr[1];
        				list.add(0, arr[1]);
        			}
        		} else {
        			list.add(arr[1]);
        			answer += arr[1];
        		}
        	}
        }
        
        System.out.println(answer);
        br.close();
    }
}