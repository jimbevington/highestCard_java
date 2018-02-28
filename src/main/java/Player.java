import java.util.ArrayList;

public class Player {

    private String name;
    private Hand hand;

    public Player(String name){
        this.name = name;
        this.hand = new Hand();
    }

    public int cardCount(){
        return this.hand.cardCount();
    }
}
