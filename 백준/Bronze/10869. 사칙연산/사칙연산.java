import java.util.Scanner;

class sol {
	int a, b;
	public sol(int x, int y) {a = x; b = y;}
	public void print() {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sol ans = new sol(sc.nextInt(), sc.nextInt());
		ans.print();
		sc.close();
	}
}