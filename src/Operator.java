public class Operator {
    public static void main(String[] args) {
        int i = 10;
        i += 2;
        i -= 5;
        i *= 6;

        //Note: Remember when calculating for i that its recursive sort of where the previous value for i is used when working on the next expression

        System.out.println(i);
        System.out.println(i += 3);
        System.out.println(i /= 2);
    }
}
