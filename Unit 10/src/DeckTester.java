public class DeckTester {

	
	public static void main(String[] args) {
		String[] rank = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suit = {"Hearts", "Clubs", "Spades", "Diamonds"};
		int[] pointValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck deck = new Deck(rank, suit, pointValue);
		System.out.println("Size: " + deck.size());
		System.out.println("Empty Status: " + deck.isEmpty());
		System.out.println("First card dealt: " + deck.deal());
		System.out.println(deck);
	}
}