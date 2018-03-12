public class Card {

	private String suit;
	
	private String number;

	private int pointValue;

	public Card(String cardNumber, String cardSuit, int cardPointValue) {
		number = cardNumber;
		suit = cardSuit;
		pointValue = cardPointValue;
	}

	public String suit() {
		return suit;
   }
	
	public String number() {
		return number;
	}

  	public int pointValue() {
		return pointValue;
	}
	
	public boolean matches(Card otherCard) {
		if(this.suit == otherCard.suit && this.number == otherCard.number && this.pointValue == otherCard.pointValue)
			return true;
		return false;
	}

	
	public String toString() {
		return number + " of " + suit + " (point value = " + pointValue + ")";
	}
}