package Beginner;

public class DigitPalindrome {
    public static void main(String[] args) {
        int orgNum = 7672;
        int num = orgNum;
        int reverseNum = 0;
        
        while (num > 0) {
            int lastDigit = num % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            num =  num / 10;
        }
        System.out.println(orgNum  + " is " + (orgNum == reverseNum ?  "plindrome" : "not plindrome"));
    }
}
