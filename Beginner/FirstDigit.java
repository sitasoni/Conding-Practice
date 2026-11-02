package Beginner;

public class LastDigit {
    public static void main(String[] args) {
        int num = 867581;
        int lastDigit = num % 10;
        int firstDigit = num/10;
        System.err.println("First Digit : " + firstDigit);
        System.err.println("Last Digit : " + lastDigit);
    }
}
