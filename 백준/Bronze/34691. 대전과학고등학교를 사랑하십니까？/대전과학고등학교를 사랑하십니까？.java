import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String input;
        
        while (!(input = br.readLine()).equals("end")) {
        	switch (input.charAt(0)) {
        	case 'a': sb.append("Panthera tigris\n");
        		break;
        	case 'f': sb.append("Forsythia koreana\n");
        	break;
        	case 't' : sb.append("Pinus densiflora\n");
        	}
        }
        
		System.out.print(sb);
        br.close();
    }
}