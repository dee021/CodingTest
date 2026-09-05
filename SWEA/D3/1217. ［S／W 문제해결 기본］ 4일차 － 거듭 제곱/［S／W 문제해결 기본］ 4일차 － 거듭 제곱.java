import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		
        for (int t = 1; t <= 10; t++) {
            // sc = new Scanner(System.in);
            sc.nextInt();
        	int n = sc.nextInt(), m = sc.nextInt();
            
            System.out.println(String.format("#%d %d", t, sol(n, m)));
        }
    }
    
    static int sol(int n, int m) {
    	if (m == 0) return 1;
    	if (m == 1) return n;
    	
    	int tmp = sol(n, m/2);
    	if (m % 2 > 0) return tmp*tmp*n;
    	return tmp*tmp;
    }
}