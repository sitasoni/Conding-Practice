package Beginner;

public class DigitsReverse {
    public static void main(String[] args) {

        int num = 65701;
        int reverseNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println("Result : " + reverseNum);
    }
}
