import java.util.ArrayList;
import java.util.Collections;

public class Hand {

    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public int cardCount(){
        return this.cards.size();
    }

    public void addCard(Card card){
        this.cards.add(card);
    }

    public int getTotal(){
        int total = 0;
//        only loop over cards if there are some.
        if (this.cards.size() > 0) {
            for (Card card : this.cards) {
//                add the card Value to total
                total += card.getValueFromEnum();
            }
        }
        return total;
    }

    public int getHighestValue(){
        ArrayList<Integer> card_values = new ArrayList<>();
//        loop over cards and put their values in ArrayList
        for (Card card : this.cards) {
            card_values.add(card.getValueFromEnum());
        }
//        return the max card value in the list
        return Collections.max(card_values);
    }

}
