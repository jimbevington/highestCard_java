import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
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

    public ArrayList<Card> getCards() {
        return cards;
    }
}
