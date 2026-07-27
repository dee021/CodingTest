import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tc; t++) {
        	long n = Long.parseLong(br.readLine());
        	String bin = Long.toBinaryString(n);
        	int turn = 1, maxturn = bin.length();
        	boolean alice = true, lastAlice = maxturn % 2 < 1, lastWin = true;
            // 		   alice 턴, 	  마지막주자가 alice?,	        마지막 주자가 승리?

        	while (turn < maxturn && lastWin) {
        		if (alice == lastAlice) if (bin.charAt(turn) == '1') break; // 방어 성공
        		if (alice != lastAlice) if (bin.charAt(turn) == '0') lastWin = false; // 방해 성공
        		
        		turn++;
        		alice ^= true;
        	}
        	
        	if (lastWin) sb.append(String.format("#%d %s\n", t, lastAlice? "Alice":"Bob"));
        	else sb.append(String.format("#%d %s\n", t, lastAlice? "Bob" :"Alice"));
        }
        
        System.out.println(sb);
        br.close();
    }
}