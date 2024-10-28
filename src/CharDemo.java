public class CharDemo {
    public static void main(String[] args) {
        char oluchi = 'b';
//        Note: you can't store more than one letter at a time in a char variable, if you want to store more than one letter we use a string

//        This
        char myBigOluchi = Character.toUpperCase(oluchi);
        //Note: we use Character.toUpperCase method above because in java we need to tell the program it's a character we are dealing with, unlike in javascript where we just use .toUpperCase
        System.out.println(myBigOluchi);

//        or
//        System.out.println(Character.toUpperCase(oluchi));
    }
}

