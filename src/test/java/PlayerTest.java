import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card;
    private Deck deck;

    @Before
    public void before(){
        player = new Player("Jim");
        card = new Card(SuitType.CLUBS, ValueType.EIGHT);
        deck = new Deck();
        deck.populate();
    }

    @Test
    public void hasEmptyHand(){
        assertEquals(0, player.cardCount());
    }

    @Test
    public void canGetCards(){
        player.addCardToHand(card);
        assertEquals(1, player.cardCount());
    }

//    made when struggling with Game dealCardsToPlayers()
    @Test
    public void canGetCardsFromDeck(){
        Card card = deck.deal();
        player.addCardToHand(card);
        assertEquals(1, player.cardCount());
    }


}
