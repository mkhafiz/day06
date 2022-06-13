package day06;

import java.io.Console;
import java.util.Arrays;

public class Deck {

    public static void main(String[] args) {

        Console cons = System.console();

        String input = " ";
        Boolean run = true;
        
        //Create deck
        final String [] suits = {"Diamonds", "Clubs", "Hearts", "Spade"};
        final String [] ranks = {"2","3","4","5","6","7","8","9", "10", "Jack","Queen","King","Ace"};
        int n = suits.length * ranks.length;
        String [] deck = new String[n];


        for (int i = 0; i < suits.length; i++ )
            for (int j =0; j < ranks.length; j++)
                deck[suits.length * j + i] = ranks[j] + " of " + suits[i];

                System.out.println(Arrays.toString(deck));

        /*while (run) {
            input = cons.readLine("Shuffle/ Draw/ List ");

            if (input.length() < 1) {
                run = false;
                System.out.println("Session ended. ");
            } else {

                switch (input) {
                    case "Shuffle":

                }
            } 
        } */

    }
}
