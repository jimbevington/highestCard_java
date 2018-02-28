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
    private Card card3;
    private Card card4;

    @Before
    public void before(){
        player1 = new Player("Alfredo");
        player2 = new Player("Michael");
        game = new Game(player1, player2);
        card1 = new Card(SuitType.CLUBS, ValueType.EIGHT);
        card2 = new Card(SuitType.CLUBS, ValueType.ACE);
        card3 = new Card(SuitType.DIAMONDS, ValueType.KING);
        card4 = new Card(SuitType.SPADES, ValueType.QUEEN);
    }

    @Test
    public void canDealToPlayers_1card(){
        game.dealToPlayers_1card();
        ArrayList<Player> players = game.getPlayers();
//        check both players have a card
        for (Player player : players) {
            assertEquals(1, player.cardCount());
        }
    }

    @Test
    public void canDealToPlayers_2cards(){
        game.dealToPlayers_2cards();
        ArrayList<Player> players = game.getPlayers();
//        check both players have a card
        for (Player player : players) {
            assertEquals(2, player.cardCount());
        }
    }

    @Test
    public void canCheckWin_1Card__player1(){
        player1.addCardToHand(card1);
        player2.addCardToHand(card2);
        Game game2 = new Game(player1, player2);
        assertEquals("Player 1 wins!", game2.checkWinner());
    }

    @Test
    public void canCheckWin_1Card__player2(){
        player1.addCardToHand(card1);
        player2.addCardToHand(card3);
        Game game2 = new Game(player1, player2);
        assertEquals("Player 2 wins!", game2.checkWinner());
    }

    @Test
    public void canCheckWin__draw(){
        player1.addCardToHand(card1);
        player2.addCardToHand(card1);
        Game game2 = new Game(player1, player2);
        assertEquals("It's a draw!", game2.checkWinner());
    }

    @Test
    public void canCheckWin_2Cards__player1(){
        player1.addCardToHand(card1);
        player1.addCardToHand(card3);
        player2.addCardToHand(card2);
        player2.addCardToHand(card4);
        Game game2 = new Game(player1, player2);
        assertEquals("Player 1 wins!", game2.checkWinner());
    }

    @Test
    public void canCheckWin_2Cards__player2(){
        player1.addCardToHand(card1);
        player1.addCardToHand(card2);
        player2.addCardToHand(card3);
        player2.addCardToHand(card4);
        Game game2 = new Game(player1, player2);
        assertEquals("Player 2 wins!", game2.checkWinner());
    }

}
