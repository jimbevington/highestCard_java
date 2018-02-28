import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private Player player1;
    private Player player2;

    @Before
    public void before(){
        player1 = new Player("Alfredo");
        player2 = new Player("Michael");
        game = new Game(player1, player2);
    }

    @Test
    public void canDealToPlayers(){
        game.dealToPlayers();
        ArrayList<Player> players = game.getPlayers();
//        check both players have a card
        for (Player player : players) {
            assertEquals(1, player.cardCount());
        }

    }
}
