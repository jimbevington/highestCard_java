import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card1;
    private Card card2;
    private Deck deck;

    @Before
    public void before(){
        player = new Player("Jim");
        card1 = new Card(SuitType.CLUBS, ValueType.EIGHT);
        card2 = new Card(SuitType.HEARTS, ValueType.KING);
        deck = new Deck();
        deck.populate();
    }

    @Test
    public void hasEmptyHand(){
        assertEquals(0, player.cardCount());
    }

    @Test
    public void canGetCards(){
        player.addCardToHand(card1);
        assertEquals(1, player.cardCount());
    }

//    made when struggling with Game dealCardsToPlayers()
    @Test
    public void canGetCardsFromDeck(){
        Card card = deck.deal();
        player.addCardToHand(card);
        assertEquals(1, player.cardCount());
    }

    @Test
    public void canGetCardsTotal(){
        player.addCardToHand(card1);
        player.addCardToHand(card2);
        assertEquals(18, player.getHandTotal());
    }

    @Test
    public void canGetHighestHandValue(){
        player.addCardToHand(card1);
        player.addCardToHand(card2);
        assertEquals(10, player.getHighestHandValue());
    }

}
