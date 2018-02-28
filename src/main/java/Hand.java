import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;

    public Hand(ArrayList<Card> cards){
        this.cards = cards;
    }

    public int cardCount(){
        return this.cards.size();
    }

    public void addCard(Card card){
        this.cards.add(card);
    }

}
