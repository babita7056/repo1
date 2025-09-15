//10.Write a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute the deck of n cards to x number of players. Finally, print the cards the players have.
package StringLevel3;
import java.util.Scanner;
public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numPlayers = sc.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int numCards = sc.nextInt();
        String[][] players = distributeCards(numPlayers, numCards);
        printPlayersAndCards(players);
        sc.close();
    }
    public static String[][] distributeCards(int numPlayers, int numCards) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[i * ranks.length + j] = ranks[j] + " of " + suits[i];
            }
        }
        String[][] players = new String[numPlayers][numCards];
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards; j++) {
                int cardIndex = (int) (Math.random() * deck.length);
                players[i][j] = deck[cardIndex];
                deck[cardIndex] = deck[deck.length - 1];
                deck[deck.length - 1] = null;
            }
        }
        return players;
    }
    public static void printPlayersAndCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("Card " + (j + 1) + ": " + players[i][j]);
            }
            System.out.println();
        }
        System.out.println("Game Over!");
    }
}
