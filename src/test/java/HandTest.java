import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HandTest {

    private Hand hand;
    private ArrayList<Card> cards;
    private Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, ValueType.ACE);
        cards = new ArrayList<>();
        hand = new Hand(cards);
    }

    @Test
    public void canAddCard(){
        hand.addCard(card);
        assertEquals(1, hand.cardCount());
    }

}
