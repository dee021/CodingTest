import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        boolean check = input.length() > 2 && input.startsWith("\"") && input.endsWith("\"");

        System.out.println(check? input.substring(1, input.length() -1): "CE");
        br.close();
    }
}