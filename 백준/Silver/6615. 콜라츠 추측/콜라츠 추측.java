import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
		

		
		while (a > 0 || b > 0) {
			long[] res = search(a, b);
			sb.append(String.format("%d needs %d steps, %d needs %d steps, they meet at %d\n", a, res[1], b, res[2], res[0]));
			
			st = new StringTokenizer(br.readLine(), " ");
			a = Long.parseLong(st.nextToken());
			b = Long.parseLong(st.nextToken());
		}
		
		System.out.println(sb);
		br.close();
	}
	
	static long[] search(long a, long b) {
		
		ArrayDeque<Long> aPath = path(a);
		ArrayDeque<Long> bPath = path(b);
		long[] res = {1, aPath.size(), bPath.size()};
        
		while (res[1] > 0 && res[2] > 0 && aPath.getFirst().equals(bPath.getFirst())) {
			res[0] = aPath.poll();
			bPath.poll();
			res[1]--;res[2]--;
		}
		return res;
	}
    
	static ArrayDeque<Long> path(long x) {
		ArrayDeque<Long> path = new ArrayDeque<>(Arrays.asList(x));
		while (path.getFirst() != 1) {
			if (path.getFirst() % 2 == 0) path.addFirst(path.getFirst()/2);
			else path.addFirst(path.getFirst()*3+1);
		}
		return path;
	}
}