import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Random;


public class dontTellThemTheyLost {
    public static void main(String[] args) {
        Scanner scanIntent = new Scanner(in);

        out.println("Please enter a number between 1 and 10");
        int number = scanIntent.nextInt();

        int randomNumber = new Random().nextInt(10) + 1;

        if(number == randomNumber) {
            out.println("You Win!");
        }

        out.println("That was a good guess!");
        out.print("random number was : ");
        out.println(randomNumber + ".");
        out.println("Thanks for playing");

        scanIntent.close();
    }
}
