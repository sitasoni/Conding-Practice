package Beginner;

public class DigitsSum {
    public static void main(String[] args) {
        int num = 534896;
        int sum = 0;

        while (num > 0){
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        System.out.println("Result : " + sum);
    }
}
