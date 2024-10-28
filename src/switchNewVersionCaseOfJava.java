import java.util.Scanner;

import static java.lang.System.*;

//Note: so in the new version of java one can compare one or more scenerios in the same case it can be demonstarted by intergers such as 2, 4 or strings such as "yes", "no".

public class switchNewVersionCaseOfJava {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        out.println("How long ago was oluchi in love");

        int oluchi = keyboard.nextInt();

        switch(oluchi) {
            case 2, 4 ->  out.println("its been 3 years");
            case  5, 6 -> out.println("its been 4 years");
            case  7, 8 -> out.println("its been 5 years");
            default -> out.println("its been 0 years");
        }

        out.println("Oluchi you need to work on your date life regardless");
        keyboard.close();

    }
}
