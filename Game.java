/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wil_java;

/**
 *
 * @author Dane
 */
import java.util.ArrayList;
import java.util.List;

public class Game {
    private Deck deck;
    private List<Player> players;

    public Game(int numPlayers) {
        deck = new Deck();
        deck.shuffle();
        players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            players.add(new Player("Player " + (i + 1))); // Assign names to players
        }
    }

    public void dealCardsToPlayers() {
        for (Player player : players) {
            System.out.println(deck + ": ");
            for (int i = 0; i < 5; i++) {
                Card card = deck.dealCard();
                player.addCardToHand(card);
                System.out.print(card + ", " );               
            }
        System.out.println();
        }
    }

    public Player determineWinner() {
        Player winner = null;
        int highestScore = -1;

        for (Player player : players) {
            int score = player.calculateScore();
            if (score > highestScore || (score == highestScore && player.getSuitScore() > winner.getSuitScore())) {
                highestScore = score;
                winner = player;
            }
            
            System.out.println(score);
        }
        return winner;
    }
    
    public List<Player> getPlayers() {
        return players;
    }
}