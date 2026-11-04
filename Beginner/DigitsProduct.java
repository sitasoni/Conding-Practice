package Beginner;

public class DigitsProduct {
    public static void main(String[] args) {
        int num = 123452;
        int product = 1;

        while (num > 0) {
            int lastDigit = num % 10;
            product = product * lastDigit;
            num = num / 10;
        }
        System.out.println("Result : " + product);
    }
}
