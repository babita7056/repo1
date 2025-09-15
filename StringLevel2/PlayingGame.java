//9.Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.

package StringLevel2;
import java.util.Scanner;
public class PlayingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games to play: ");
        int numberOfGames = scanner.nextInt();
        scanner.nextLine(); 

        String[][] gameResults = new String[numberOfGames][3];
        int userWins = 0;
        int computerWins = 0;
        int draws = 0;

        for (int i = 0; i < numberOfGames; i++) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();

            String result = determineWinner(userChoice, computerChoice);
            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = result;

            if (result.equals("User Wins")) {
                userWins++;
            } else if (result.equals("Computer Wins")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        String[][] stats = calculateStats(userWins, computerWins, draws, numberOfGames);
        displayResults(gameResults, stats);

        scanner.close();
    }
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        int index = (int) (Math.random() * 3);
        return choices[index];
    }
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "User Wins";
        } else {
            return "Computer Wins";
        }
    }
    public static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[3][2];
        stats[0][0] = "User Wins";
        stats[0][1] = String.valueOf(userWins);
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        stats[2][0] = "Draws";
        stats[2][1] = String.valueOf(draws);
        return stats;
    }
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.printf("%-15s %-15s %-15s%n", "User Choice", "Computer Choice", "Result");
        System.out.println("---------------------------------------------------");
        for (String[] result : gameResults) {
            System.out.printf("%-15s %-15s %-15s%n", result[0], result[1], result[2]);
        }
        System.out.println("\nGame Statistics:");
        System.out.printf("%-15s %-15s%n", "Outcome", "Count");
        System.out.println("-------------------------------");
        for (String[] stat : stats) {
            System.out.printf("%-15s %-15s%n", stat[0], stat[1]);
        }
    }
    
}
