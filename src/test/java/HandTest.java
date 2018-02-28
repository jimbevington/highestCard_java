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
        hand = new Hand();
    }

    @Test
    public void canAddCard(){
        hand.addCard(card);
        assertEquals(1, hand.cardCount());
    }

    @Test
    public void canGetTotal__noCards(){
        assertEquals(0, hand.getTotal());
    }

    @Test
    public void canGetTotal__1card(){
        hand.addCard(card);
        assertEquals(1, hand.getTotal());
    }

    @Test
    public void canGetTotal__2cards(){
        hand.addCard(card);
        Card card2 = new Card(SuitType.CLUBS, ValueType.FOUR);
        hand.addCard(card2);
        assertEquals(5, hand.getTotal());
    }

    @Test
    public void canGetHighestValue(){
        hand.addCard(card);
        Card card2 = new Card(SuitType.CLUBS, ValueType.FOUR);
        hand.addCard(card2);
        assertEquals(4, hand.getHighestValue());
    }

}
