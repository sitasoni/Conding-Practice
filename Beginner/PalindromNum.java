package Beginner;

public class PalindromNum {
    public static void main(String[] args) {
        int orgNum = 767;
        int num = orgNum;
        int reverseNum = 0;
        
        while (num > 0) {

            int lastDigit = num % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            num = num / 10;
        }
        if(orgNum ==  reverseNum) System.out.println(orgNum + " is a palindrome");
        else System.out.println(orgNum + " is not a palindrome");

    }
}
