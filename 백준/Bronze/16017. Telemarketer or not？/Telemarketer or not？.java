import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean isTelemarketer = true;
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) arr[i] = Integer.parseInt(br.readLine());
        if (arr[0] < 8 || arr[3] < 8) isTelemarketer = false;
        else if (arr[1] != arr[2]) isTelemarketer = false;
        
        System.out.println(isTelemarketer?"ignore":"answer");
        
        br.close();
    }
}