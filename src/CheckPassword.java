import java.util.Scanner;
import static java.lang.System.*; //Note: The use of .* here indicates that we are importing all system methods both in and out.



public class CheckPassword {
    public static void main(String[] args) {
        out.println("What's the password!");
        Scanner mask = new Scanner(in);
        String password = mask.next();


        out.println("you typed >> " + password + "<<");
        out.println();


        if(password.equals("swordfish")) { //Note: password.equals("swordfish") is same as password == swordfish but this == sign own is not the current version, we can also use .equalsIgnoreCase so that it ignores the case in which the letters of the password input by the user.
            System.out.println("YES I GOT IT RIGHT");
        } else {
            System.out.println("NO");
        }

        out.println();
        mask.close();

    }
}
