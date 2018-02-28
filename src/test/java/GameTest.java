import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private Player player1;
    private Player player2;
    private Card card1;
    private Card card2;

    @Before
    public void before(){
        player1 = new Player("Alfredo");
        player2 = new Player("Michael");
        game = new Game(player1, player2);
        card1 = new Card(SuitType.CLUBS, ValueType.EIGHT);
        card2 = new Card(SuitType.CLUBS, ValueType.ACE);
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

    @Test
    public void canCheckWin__player1(){
        player1.addCardToHand(card1);
        player2.addCardToHand(card2);
        Game game2 = new Game(player1, player2);
        assertEquals("Player 1 wins!", game2.checkWinner());
    }

    @Test
    public void canCheckWin__player2(){
        Card card3 = new Card(SuitType.DIAMONDS, ValueType.KING);
        player1.addCardToHand(card1);
        player2.addCardToHand(card3);
        Game game2 = new Game(player1, player2);
        assertEquals("Player 2 wins!", game2.checkWinner());
    }
}
