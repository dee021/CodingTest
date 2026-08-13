import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Scanner;
import java.io.FileInputStream;

class Node {
	int no, left, right;
	char value;
	
	Node(String[] strArr) {
		this.no = Integer.parseInt(strArr[0]);
		this.value = strArr[1].charAt(0);
		
		switch(strArr.length) {
		case 4: this.right = Integer.parseInt(strArr[3]);
		case 3: this.left = Integer.parseInt(strArr[2]);
		break;
		default: this.left = this.right = -1;
		
		}
	}

	@Override
	public String toString() {
		return "Node [no=" + no + ", left=" + left + ", right=" + right + ", value=" + value + "]";
	}

	public int getNo() {
		return no;
	}

	public int getLeft() {
		return left;
	}

	public int getRight() {
		return right;
	}

	public char getValue() {
		return value;
	}
}

class Solution
{
    static Node[] node;
    
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        for (int t = 1; t <= 10; t++) {
        	int n = Integer.parseInt(br.readLine());
        	node = new Node[n+1];
        	for (int i = 1; i < n+1; i++) {
        		node[i] = new Node(br.readLine().split(" "));
        	}
        	
        	sb.append(String.format("#%d %s\n", t, inOrder(node[1])));
        }
        
        System.out.println(sb);
        br.close();
    }
    
    static String inOrder(Node root) {
    	String res = "";
    	if (root.getLeft() > 0) res += inOrder(node[root.getLeft()]);
    	res += root.value;
    	if (root.getRight() > 0) res += inOrder(node[root.getRight()]);
    	return res;
    }
}