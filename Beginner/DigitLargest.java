package Beginner;

public class DigitLargest {
    public static void main(String[] args) {
        int num = 967437;
        int largestDigit = 0;
 
        while (num > 0) {
            int digit = num % 10;
            if(digit > largestDigit) largestDigit = digit;
            num = num/10;
        }
        System.out.println("Result : " + largestDigit);
    }
}
