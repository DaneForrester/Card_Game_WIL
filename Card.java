/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wil_java;

/**
 *
 * @author Dane
 */
public class Card {
    private int value;
    private int suit;
    
    public Card(int value, int suit){
        this.value = value;
        this.suit = suit;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public int getSuit(){
        return suit;
    }
    
    public void setSuit(int suit){
        this.suit = suit;
    }
    
    @Override
    public String toString() {
        String cardName = "";

        // Convert card value to a readable name
        switch (value) {
            case 11:
                cardName += "J";
                break;
            case 12:
                cardName += "Q";
                break;
            case 13:
                cardName += "K";
                break;
            case 14:
                cardName += "A";
                break;
            default:
                cardName += value;
        }

        // Add the suit to the card name
        switch (suit) {
            case 1:
                cardName += "D";
                break;
            case 2:
                cardName += "H";
                break;
            case 3:
                cardName += "S";
                break;
            case 4:
                cardName += "C";
                break;
        }

        return cardName;
    }
}