/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
//s
	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rank1 = {"jack", "queen", "king"};
		String[] suit1 = {"hearts", "spades", "diamonds"};
		int[] value1 = {10, 10, 10};
	    Deck deck1 = new Deck(rank1, suit1, value1);
	    System.out.println(deck1.isEmpty());
	    System.out.println(deck1.size());
	 //   System.out.println(deck1.deal());
	    System.out.println(deck1);
	    
	    String[] rank2 = {"9", "queen", "king"};
	    String[] suit2 = {"clubs", "spades", "diamonds"};
	    int[] value2 = {9, 10, 10};
	    Deck deck2 = new Deck(rank2, suit2, value2);
	    System.out.println(deck2.isEmpty());
	    System.out.println(deck2.size());
	//    System.out.println(deck2.deal());
	    System.out.println(deck2);

	    String[] rank3 = {"1", "3", "queen"};
	    String[] suit3 = {"clubs", "spades", "hearts"};
	    int[] value3 = {1, 3, 10};
	    Deck deck3 = new Deck(rank3, suit3, value3);
	    System.out.println(deck3.isEmpty());
	    System.out.println(deck3.size());
	 //   System.out.println(deck3.deal());
	    System.out.println(deck3);

	}
}