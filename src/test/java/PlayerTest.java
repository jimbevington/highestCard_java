import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;

    @Before
    public void before(){
        player = new Player("Jim");
    }

    @Test
    public void hasEmptyHand(){
        assertEquals(0, player.cardCount());
    }
}
