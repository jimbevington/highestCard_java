import java.util.ArrayList;

public class Player {

    private String name;
    private Hand hand;

    public Player(String name){
        this.name = name;
        this.hand = new Hand();
    }

//    for testing
    public int cardCount(){
        return this.hand.cardCount();
    }

    public void addCardToHand(Card card){
        this.hand.addCard(card);
    }

    public int getHandTotal(){
        return this.hand.getTotal();
    }


}
