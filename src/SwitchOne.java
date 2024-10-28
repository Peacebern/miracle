import java.util.Scanner;
import static java.lang.System.*;


public class SwitchOne {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        out.print("Which verse");
        int verse = keyboard.nextInt();

        //Note: Switch statement is same as if else staements but it makes it easier to compare stuff. For instance here we compare the variable verse which is inputed by the user and then compared with several cases in the switch statement

        switch (verse) {
            case 1 -> out.println("That's because he has no brain");
            case 2 -> out.println("That's because he is in pain");
            case 3 -> out.println("cause this is the last refrain");
            default -> out.println("No such verse. Please try again later");
        }

        out.println("oh, oh, oh, oh");

        keyboard.close();

    }
}
