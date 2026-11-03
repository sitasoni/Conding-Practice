package Beginner;

public class SumDigits {
    public static void main(String[] args) {
        int num = 534896;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            num = num/10;
             sum = sum + digit;
        }
        System.out.println("Result : " + sum);
    }
}
