public class ElevatorFitter {
    public static void main(String[] args) {
//        Note: int data type is used to declare a whole number
        int weightOfPerson;
        int elevatorWeightLimit;
        int numberOfPeople;

        weightOfPerson = 150;
        elevatorWeightLimit = 1400;
        numberOfPeople = elevatorWeightLimit / weightOfPerson;

        System.out.print("You can fit ");
        System.out.print(numberOfPeople);
        System.out.println(" people on the elevator");

    }
}
