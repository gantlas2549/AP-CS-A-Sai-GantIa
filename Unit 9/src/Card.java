/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {
  //s
  private String suit;     
  private String rank;     
  private int pointValue;  
  //this is a new comment
  public Card(String cardRank, String cardSuit, int cardPointValue) {
    suit = cardSuit;
    rank = cardRank;
    pointValue = cardPointValue;
  }
  
  public String suit() {
    return suit;
  }
  
  public String rank() {
    return rank;
  }
  
  public int pointValue() {
    return pointValue;
  }
  
  /** Compare this card with the argument.
    * Return true if the rank, suit, and 
    * point value of this card are equal 
    * to those of the argument; false 
    * otherwise.
    */
  public boolean matches(Card otherCard) {
    if(otherCard.suit().equals(this.suit()) && otherCard.rank().equals(this.rank()) && otherCard.pointValue() == this.pointValue())
      return true;
    else
      return false;
  }
  
  /**
   * Converts the rank, suit, and point value into a string in the format
   *     "[Rank] of [Suit] (point value = [PointValue])".
   */
  @Override
  public String toString() {
    return rank + " of " + suit + " (point value = " + pointValue + ")";
  }
}