import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Card {
	private String name;
	private int count;
	private ArrayList<Integer> cards;
	
	public Card(String name, int n) {
		this.name = name;
		count = n;
		cards = new ArrayList();
	}
	
	public void inputs(int k) {
		cards.add(k);
		if (cards.size() == count) cards.sort(null);
	}
	
	public boolean isExist(int k) {
		return cards.contains(k);
	}
	
	public int findNum(int k) {
		for (int i = 0; i < cards.size(); i++) {
			if (cards.get(i) > k) {
				int res = cards.get(i);
				cards.remove(i);
				this.count--;
				return res;
			}
		}
		return 0;
	}
	public int count() {return this.count;}
}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Card sg = new Card("sg", n);
		Card gs = new Card("gs", n);
		
		for (int i = 0; i < n; i++) {
			sg.inputs(Integer.parseInt(br.readLine()));
		}
		
		for (int i = 1; i < 2*n +1; i++) {
			if (!sg.isExist(i)) gs.inputs(i);
		}
		
		int k = 0;
		byte key = 0;
		int res;
		while (sg.count() > 0 && gs.count() > 0) {
			if (key == 0) res = sg.findNum(k);
			else res = gs.findNum(k);
			if (res > 0) k = res;
			else k = 0;
			key ^=1 ;
		}
		System.out.println(gs.count());
		System.out.println(sg.count());
	}
}