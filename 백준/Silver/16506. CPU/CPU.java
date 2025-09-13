import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
	static Map<String, String> opcode = new HashMap<>();
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        setOpcode();

        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
        	sb.append(getCode(br.readLine().split(" "))).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static void setOpcode() {
    	int v = 0;
    	
    	for (String op:"ADD SUB MOV AND OR NOT MULT LSFTL LSFTR ASFTR RL RR".split(" ")) {
    		String bin = Integer.toBinaryString(v++);
    		opcode.put(op, "0000".substring(bin.length()) + bin);
    	}
    }
    
    static String getCode(String[] input) {
    	StringBuilder sb = new StringBuilder();
    	
    	boolean c = false;
    	
    	for (String key: opcode.keySet()) {
    		if (input[0].equals(key)) {
    			sb.append(opcode.get(key) + "00");
    			break;
    		}
    		else if (input[0].equals(key + "C")) {
    			sb.append(opcode.get(key) + "10");
    			c = true;
    			break;
    		}
    	}
    	
    	for (int i = 1; i < 4; i++) {
    		String bin = Integer.toBinaryString(Integer.parseInt(input[i]));
    		if (i == 3) {
    			if (c) sb.append("0000".substring(bin.length()) + bin);
    			else sb.append("000".substring(bin.length()) + bin).append("0");
    		}else sb.append("000".substring(bin.length()) + bin);
    	}
    	
    	return sb.toString();
    }
}