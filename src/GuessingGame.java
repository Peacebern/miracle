import java.util.Scanner; //Note: This is a method imported so we can use it to get te users input so it's like prompt in javascript
import java.util.Random;
import static java.lang.System.out;



public class GuessingGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.println("Enter an int fom 1 to 10 : ");

        int inputNumber = keyboard.nextInt(); // Note: .nextInt() is used here so that whatever the user inputs will be a whole interger i.e a whole number
        //Note:  If you expect the user to type a double value (a number containing a decimal point),
        //use nextDouble(). If you expect the user to type true or false, use nextBoolean(). If you expect the user to type a word like Barry, Java, or Hello, use next().

        int randomNumber = new Random().nextInt(10) + 1;


        if (randomNumber == inputNumber) {
            out.println("************");
            out.println("*.You win!.*");
            out.println("************");
        } else{
            out.println("*.You lose!.*");
            out.println("The random number was");
            out.println(randomNumber + ".");
        }

        out.println("Thank you for playing");

        keyboard.close();
    }

}

//Note: The idea here is to create a simple game where the player guesses a number, and the computer generates a random number as the "correct answer." The comparison between the two (if (inputNumber == randomNumber)) is the core decision-making part that determines whether the player wins or loses.
