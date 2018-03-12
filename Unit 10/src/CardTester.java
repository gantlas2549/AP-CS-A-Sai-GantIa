public class CardTester {

	
	public static void main(String[] args) {
		Card c1 = new Card("Five", "Hearts", 10);
		Card c2 = new Card("Ace", "Spades", 1);
		Card c3 = new Card("King", "Hearts", 13);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("Card 1 matches Card 2: " + c1.matches(c2));
		System.out.println("Card 2 matches Card 3: " + c2.matches(c3));
		System.out.println("Card 1 matches Card 3: " + c1.matches(c3));
	}
}