


import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random = new Random();
        int minRange= 1;
        int maxRange= 100;
        int maxAttempts= 10;
        int totalRounds= 0;
        int score=0;

        System.out.println("*****WELCOME TO THE NUMBER GAME*****");
        boolean playAgain=true;
        while (playAgain){
            int generatedNumber = random.nextInt(maxRange-minRange+1)+minRange;
            int attempts=0;
            boolean guessedCorrectly=false;

            System.out.println("\nRound: " + (totalRounds +1));
            System.out.println("\nSystem has generated a number between " + minRange+ "and"+ maxRange +".");
            System.out.println("you have "+ maxAttempts+"attempts to guess the number. GOOD LUCK!");
            totalRounds++;

            while (attempts<maxAttempts && !guessedCorrectly){
                System.out.println("\nAttempt: "+ (attempts+1)+"/"+maxAttempts);
                System.out.println("Enter your Guess => ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();

                if (userGuess < generatedNumber){
                    System.out.println("Its too low !");
                } else if (userGuess < generatedNumber) {
                    System.out.println("Its too high !");
                }else {
                    System.out.println("You Guessed the right Number !");
                    guessedCorrectly=true;
                    score++;
                }

                attempts++;
            }
            if (!guessedCorrectly){
                System.out.println("OOps you have used all attempts.");
                System.out.println("The correct number was: "+generatedNumber);
            }

            System.out.println("Want to play Again (Yes/No)");
            String playAgainResponse = scanner.nextLine();
            if (!playAgainResponse.equalsIgnoreCase("yes")){
                playAgain =false;
            }

        }
        System.out.println("Game Over ! your score is: "+score);
        System.out.println("Thanks for Playing!");
    }
}
