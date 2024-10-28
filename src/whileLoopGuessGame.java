import java.util.Scanner;
import java.util.Random;
import static java.lang.System.*;



public class whileLoopGuessGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numGuesses = 0;
        int randomNumber = new Random().nextInt(10) + 1;

        out.println("*********");
        out.println("Welcome to the guesssing game !");
        out.println("*********");
        out.println();

        out.println("Please enter a number between 1 and 10");
        int inputNumber = keyboard.nextInt();
        numGuesses++;

        while(inputNumber != randomNumber) {
            out.println();
            out.println("Try again");
            out.println("Enter a number between 1 and 10");
            inputNumber = keyboard.nextInt();
            numGuesses++;
        }
        out.println("You have guessed right");
        out.println("You have guessed " + numGuesses + " guesses");
        keyboard.close();
    }
}
