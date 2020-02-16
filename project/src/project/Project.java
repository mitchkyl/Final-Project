/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Kyle
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         int deck[] = new int[52];
        String suits[] = {"Hearts", "Clubs", "Spades", "Diamonds"};
        String ranks[] = {"Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};

        //Generates an array
        for (int i = 1; i < deck.length; i++) {

            deck[i] = i;
        }

        //Shuffle the deck
        for (int i = 0; i < deck.length; i++) {

            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        for (int i = 0; i < 2; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];

            System.out.println("Your hand contains: " + deck[i] + ": " + rank + " of "
                    + suit);

        }

        for (int j = 0; j < 1; j++) {
            String suit = suits[deck[j] / 13];
            String rank = ranks[deck[j] % 13];

            System.out.println("Dealers hand shows: " + deck[j] + ": " + rank + " of "
                    + suit);

        }
        
        
    }
    
}
