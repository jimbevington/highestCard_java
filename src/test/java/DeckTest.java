import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        assertEquals(2, deck.getCards().get(14).getValueFromEnum());
    }

    @Test
    public void canDealCards(){
        deck.populate();
        Card card = deck.deal();
//        check that the deck no longer contains the dealt card
        assertFalse(deck.getCards().contains(card));
    }
}
