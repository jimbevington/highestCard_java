import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(Player player1, Player player2){

//        set up Players ArrayList and add the players.
        this.players = new ArrayList<>();
        this.players.add(player1);
        this.players.add(player2);

//        set up Deck with cards
        deck = new Deck();
        deck.populate();
    }

//    for testing
    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public void dealToPlayers(){
//        deal a card for each player and add it to their Hand
        for (Player player : this.players) {
            Card card = deck.deal();
            player.addCardToHand(card);
        }
    }

    public String checkWinner(){
//        assign Player Card Totals to vars
        int player1Total = this.players.get(0).getHandTotal();
        int player2Total = this.players.get(1).getHandTotal();

//        check Total vars and return winner
        if (player1Total > player2Total) {
            return "Player 1 wins!";
        }
        return "Player 2 wins!";
    }

//    public String play(){
//        dealToPlayers();
//        return checkWinner();
//    }

}
