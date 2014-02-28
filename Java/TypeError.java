class Card {
    Integer mValue;
    String  mSuit;
    
    Card(Integer value, String suit) {
        mValue = value;
        mSuit  = suit;
    }
}

public class TypeError {
    public static void main(String[] args) {
        Card h1 = new Card( 13,   "spades");
        Card h2 = new Card("Ace", "hearts");
        Card h3 = new Card( 15,   "clubs" );
    }
}