import java.util.*;
import java.io.*;

public class RockPaperScissors {
    // initialize static scanner
    static Scanner input = new Scanner(System.in);
    // initialize static variables
    static String rock = "rock";
    static String paper = "paper";
    static String scissors = "scissors";
    static int playerWinStreakNum = 0;
    static int HighestWinStreak = 0;
    // initialize static hashmap or dictionary
    public static Map<String, String> choices = new HashMap<String, String>();

    // put values in hashmap
    public static void RockDictionary() {
        choices.put("rock", "Rock");
        choices.put("paper", "Paper");
        choices.put("scissors", "Scissors");
    }

    public static String GetUserChoice() {
        while (true) {
            System.out.print("Player | (Rock, Paper, Scissors): ");
            String playerChoice = input.nextLine().toLowerCase();
            if (choices.containsKey(playerChoice)) {
                return playerChoice;
            }
            System.out.println("Invalid input");
        }
    }

    public static void DisplayChoices(String playerChoice, String computerChoice) {
        System.out.printf("Player: Chose %s \n", choices.get(playerChoice));
        System.out.printf("Computer: Chose %s \n", choices.get(computerChoice));
    }

    public static void DetermineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie");
        } else if ((playerChoice.equals(rock) && computerChoice.equals(paper)) ||
                (playerChoice.equals(paper) && computerChoice.equals(scissors)) ||
                (playerChoice.equals(scissors) && computerChoice.equals(rock))) {
            System.out.println("Computer wins! ");
            playerWinStreak("computer");
        } else {
            System.out.println("You win! ");
            playerWinStreak("player");
        }
    }

    public static String ComputerChoice() {
        // Create a list of keys from the choices map
        List<String> keys = new ArrayList<>(choices.keySet());
        // Create a random object
        Random random = new Random();
        String randomKey = keys.get(random.nextInt(keys.size()));
        String randomValue = choices.get(randomKey).toLowerCase();
        return randomValue;
    }

    public static void PlayAgain() {
        System.out.print("Type \"quit\" to exit: ");
        String playAgain = input.nextLine().toLowerCase();
        if (playAgain.equals("quit") || playAgain.equals("q")) {
            System.out.println("Goodbye!");
            SaveHighestWinStreak();
            System.exit(0);
        }
    }

    public static int playerWinStreak(String winner) {
        if (winner.equals("player")) {
            playerWinStreakNum++;
        } else if (winner.equals("computer")) {
            playerWinStreakNum = 0;
        }
        if (playerWinStreakNum > HighestWinStreak) {
            HighestWinStreak = playerWinStreakNum;
        }
        return playerWinStreakNum;
    }

    public static void SaveHighestWinStreak() {
        // try/catch method to handle exceptions locally
        try {
            FileWriter fileWriter = new FileWriter("HighestWinStreak.txt");
            fileWriter.write(Integer.toString(HighestWinStreak));
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static int LoadHighestWinStreak() {
        File file = new File("HighestWinStreak.txt");
        // try/catch method to handle exceptions locally
        try {
            if (file.exists()) {
                Scanner fileScanner = new Scanner(file);
                if (fileScanner.hasNextLine()) {
                    HighestWinStreak = Integer.parseInt(fileScanner.nextLine());
                    System.out.println("High score loaded: " + HighestWinStreak);
                } else {
                    System.out.println("File is empty, no high score found.");
                }
                fileScanner.close();
            } else {
                System.out.println("File does not exist.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Starting with a new high score.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid data in file. Unable to parse high score.");
        }
        return HighestWinStreak;
    }

    public static void main(String[] args) {
        RockDictionary();
        LoadHighestWinStreak();
        while (true) {
            String playerChoice = GetUserChoice();
            String computerChoice = ComputerChoice();
            DisplayChoices(playerChoice, computerChoice);
            DetermineWinner(playerChoice, computerChoice);
            System.out.printf("Player Win Streak: %d\nPlayer Highest Win Streak: %d\n", playerWinStreakNum,
                    HighestWinStreak);
            PlayAgain();

        }
    }
}
