import java.util.List;
import java.util.ArrayList;

public class Deck {
	
	private List<Card> cards;
	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) {
		this.cards = new ArrayList<Card>();
		for (int i = 0; i < ranks.length; i++){
			for(int j = 0; j < suits.length; j++) {
				Card newCard = new Card(ranks[i], suits[j], values[i]);
				this.cards.add(newCard);
			}
		}
		this.size = this.cards.size();
		shuffle();
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}

	public void shuffle() {
		for(int i = size-1; i > 0; i--) {
			int random = (int) (Math.random() * size);
			Card tmp = cards.get(i);
			cards.remove(i);
			cards.add(random, tmp);
		}
		size = cards.size();
	}

	public Card deal() {
		if(isEmpty()) return null;
		else {
			size--;
			return cards.get(size);
		}
	}
	
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				rtn = rtn + "\n";
			}
		}
		rtn+="\n";
		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - size()) % 2 == 0) {
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}