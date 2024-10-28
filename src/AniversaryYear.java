public class AniversaryYear {
    public static void main(String[] args) {
        int years = 7;
        //Note: below I am using double because 1/4 will give a decimal  number and i need a type declaration to work with that so as not to give errors
        double Aniversary = (1.0/4.0) * years;

        //Note: Below i used (int) to typecast Aniversary result because i don't want it to give decimal numbers or round up unnecesarily which affects the result like it happens when i use Math.round
        System.out.println((int) Aniversary);
    }
}
