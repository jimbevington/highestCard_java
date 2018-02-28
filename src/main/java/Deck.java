import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
    }

    //    just for testing
    public ArrayList<Card> getCards() {
        return cards;
    }

    public int cardCount(){
        return this.cards.size();
    }

    public void populate(){

      for (SuitType suit : SuitType.values()){
          for (ValueType value : ValueType.values()) {

              Card card = new Card(suit, value);
              this.cards.add(card);
          }
      }
    }

    public Card deal(){
//        remove/return a random card from the deck
        Collections.shuffle(this.cards);
        return this.cards.remove(0);
    }


}
