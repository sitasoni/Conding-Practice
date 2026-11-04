package Beginner;

public class DigitFirst {
    public static void main(String[] args) {
        int num = 6485;
        int lastDigit = 0;
        while (num >= 10) {
            num = num / 10;
            lastDigit = num;
        }
        System.out.println("Result : " + lastDigit);
    }

}
