/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wil_java;

/**
 *
 * @author Dane
 */

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    public Player() {
        this("Default Player"); // Assign a default name
    }

    public boolean addCardToHand(Card card) {
        if (hand.size() < 5) {
            hand.add(card);
            return true;
        } else {
            return false;
        }
    }

    public int calculateScore() {
        int score = 0;
        for (Card card : hand) {
            int cardValue = card.getValue();
            if (cardValue == 11 || cardValue == 12 || cardValue == 13) {
                score += 10;
            } else if (cardValue == 14) {
                score += 11;
            } else {
                score += cardValue;
            }
        }
        return score;
    }

    public int getSuitScore() {
        int diamonds = 0;
        int hearts = 0;
        int spades = 0;
        int clubs = 0;

        for (Card card : hand) {
            int suit = card.getSuit();
            switch (suit) {
                case 1:
                    diamonds++;
                    break;
                case 2:
                    hearts++;
                    break;
                case 3:
                    spades++;
                    break;
                case 4:
                    clubs++;
                    break;
            }
        }

        int suitScore = diamonds * 1 + hearts * 2 + spades * 3 + clubs * 4;

        return suitScore;
    }
    
    public List<Card> getHand() {
        return hand;
    }

    public void clearHand() {
        hand.clear(); // Remove all cards from the hand
    }

    public String getName(){
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
}
