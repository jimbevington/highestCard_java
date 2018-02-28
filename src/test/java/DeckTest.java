import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void canPopulateDeck(){
        deck.populate();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void deckHasCards(){
        deck.populate();
//        check SuitType and Value of 1st card, expecting Ace of Hearts
        assertEquals(SuitType.HEARTS, deck.getCards().get(0).getSuit());
        assertEquals(1, deck.getCards().get(0).getValueFromEnum());
//        check SuitType and Value of 14th card, expecting Two of Clubs
        assertEquals(SuitType.CLUBS, deck.getCards().get(14).getSuit());
//        check Value of 14th card
        assertEquals(2, deck.getCards().get(14).getValueFromEnum());
    }
}
