import java.util.Scanner;
import static java.lang.System.*;
//import java.time.Year;


public class MonthResuscitation {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        out.println("what month do you want to know how many days it has?");
        String month = keyboard.next().toLowerCase();

        String house;

        house = switch (month) {
            case "january", "march", "july", "may", "august", "october", "december"  -> month + " has 31 days";
            //case "february" -> month + "has 28 days";
            case "february" -> {
                out.println("Leap year (true/false)? ");
//                int year = keyboard.nextInt();
                boolean isLeapYear = keyboard.nextBoolean();
                if (isLeapYear) {
                    yield month + "has 29 days";
                } else {
                    yield month + "has 28 days";
                }




            }
            case "april", "june", "september", "november"  -> month + " has 30 days";
            default -> ("this month doesnt exist");
        };

        out.println(house);
        keyboard.close();


    }
}
