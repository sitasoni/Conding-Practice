package Basic.Beginner;


public class SimpleInterest {
    public static void main(String[] args) {
        int rate = 5;
        int duration = 1;
        double amount = 500000.0;

        double interest = (rate * duration * amount)/100;
        System.out.println("Result : " + interest);

    }
}
