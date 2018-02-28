import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card;

    @Before
    public void before(){
        player = new Player("Jim");
        card = new Card(SuitType.CLUBS, ValueType.EIGHT);
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
}
