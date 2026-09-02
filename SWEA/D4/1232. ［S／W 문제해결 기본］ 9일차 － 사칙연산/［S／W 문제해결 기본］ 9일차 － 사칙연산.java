import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Scanner;
import java.io.FileInputStream;

class Node {
	private boolean isNum;
	private int nValue, left, right;
	private char oValue;
	
	Node (char o, int left, int right) {
		this.isNum = false;
		this.oValue = o;
		this.left = left;
		this.right = right;
	}
	
	Node (int n) {
		this.isNum = true;
		this.nValue = n;
	}

	public boolean isNum() {
		return isNum;
	}

	public int getLeft() {
		return left;
	}

	public int getRight() {
		return right;
	}
	
	public int getnValue() {
		return nValue;
	}

	public char getoValue() {
		return oValue;
	}
}

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        
//        int tc = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= 10; t++) {
        	int n = Integer.parseInt(br.readLine());
        	Node[] node = new Node[n+1];
        	
        	for (int i = 0; i < n; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		int v = Integer.parseInt(st.nextToken());
        		String value = st.nextToken();
        		
        		if (value.matches("[0-9]+")) node[v] = new Node(Integer.parseInt(value));
        		else node[v] = new Node(value.charAt(0), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        	}
        	
        	double res = cal(node, 1);
        	sb.append(String.format("#%d %d\n", t, (int)Math.floor(res)));
        }
        
        System.out.println(sb);
        br.close();
    }
    
    static double cal(Node[] node, int cur) {
    	if (!node[cur].isNum()) 
    		switch (node[cur].getoValue()) {
    	case '+': return cal(node, node[cur].getLeft()) + cal(node, node[cur].getRight());
    	case '-': return cal(node, node[cur].getLeft()) - cal(node, node[cur].getRight());
    	case '*': return cal(node, node[cur].getLeft()) * cal(node, node[cur].getRight());
    	case '/': return (double)cal(node, node[cur].getLeft()) / cal(node, node[cur].getRight());
    	}
    	
    	return node[cur].getnValue();
    }
}