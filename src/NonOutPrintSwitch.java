import java.util.Scanner;
import static java.lang.System.*;


public class NonOutPrintSwitch {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        out.print("Which verse");
        int verse = keyboard.nextInt();
        String line; //the variable " line" would be use as a house for the switch statement in order to avoid using out.println alot of times in each case, so in this event of using the variable "line" we just have to only use out.println once to print out the value if "line" depending on the instace the input of the user cases.



        line = switch (verse) {
            case 1 -> "That's because he has no brain";
            case 2 -> "That's because he is in pain";
            case 3 -> "cause this is the last refrain";
            default -> "No such verse. Please try again later";
        };

        out.println(line);
        out.println("oh, oh, oh, oh");

        keyboard.close();

    }
}
