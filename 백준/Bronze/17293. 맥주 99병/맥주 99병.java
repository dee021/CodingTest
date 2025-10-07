import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = n; i > 2; i--) {
        	sb.append(String.format("%d bottles of beer on the wall, %d bottles of beer.\n", i, i));
        	sb.append(String.format("Take one down and pass it around, %d bottles of beer on the wall.\n\n", i-1));
        }
        
        if (n >= 2) {
        	sb.append("2 bottles of beer on the wall, 2 bottles of beer.\n");
        	sb.append("Take one down and pass it around, 1 bottle of beer on the wall.\n\n");
        }
        
        sb.append("1 bottle of beer on the wall, 1 bottle of beer.\n");
        sb.append("Take one down and pass it around, no more bottles of beer on the wall.\n\n");
        sb.append("No more bottles of beer on the wall, no more bottles of beer.\n");
        sb.append(String.format("Go to the store and buy some more, %d %s of beer on the wall.", n, n>1? "bottles": "bottle"));
        
        System.out.println(sb);
        
        br.close();
    }
}