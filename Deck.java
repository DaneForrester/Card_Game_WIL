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
import java.util.Collections;

public class Deck {
    private List<Card> cards;
    
    public Deck(){
        cards = new ArrayList<>();
        populateDeck();
    }
    
    private void populateDeck(){
        for (int suit = 1; suit <= 4; suit++){
            for (int value = 2; value <= 14; value++)
                cards.add(new Card(value, suit));
        }
    }
    
    public void shuffle(){
        Collections.shuffle(cards);
    }
    
    public Card dealCard(){
        if (cards.isEmpty()){
            populateDeck();
        }
        return cards.remove(0);
    }
    
    @Override
    public String toString() {
        StringBuilder deckString = new StringBuilder("Deck: [");

        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            deckString.append(card.toString());

            if (i < cards.size() - 1) {
                deckString.append(", ");
            }
        }

        deckString.append("]");

        return deckString.toString();
    }
    
}