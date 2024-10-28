import java.util.Scanner;
import static java.lang.System.*;


//public class noNegativity {
//    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        out.println("Enter a number that is not negative or zero: ");
//        int number = keyboard.nextInt();
//        int largest = Integer.MIN_VALUE;
//
//        while (number > 0) {
//            out.println("The number you entered is positive, keep going till you type in a negative number");
//            number = keyboard.nextInt();
//            number++;
//        }
//
//
//
//        out.println("you just typed a negative number" + number);
//        keyboard.close();
//    }
//}


public class noNegativity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int largest = Integer.MIN_VALUE; //Note: here we are equating the variable largest with the min value of an . This is done because we want to ensure any positive number entered by the user will be greater than this initial value.
        int number;


        out.println("Enter a positive number : ");

        while(true) {

            number = keyboard.nextInt();

            if(number <= 0){
                break; //Note: this breaks out of the loop of input if the user inputs a negative number
            }

            if(number > largest){ //Note: Here we are saying if the user input is greater than the min value which largest was initialized with then it becomes the new largest number
                largest = number ;
            }
        }

        if(largest == Integer.MIN_VALUE){
            out.println("The number is negative.");
        } else {
            out.println("The largest number is " + largest);
        }

        keyboard.close();
    }
}