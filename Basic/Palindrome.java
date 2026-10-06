package Basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();
        sc.close();

        palindromeString(str);
        palindromeNumber(num);
    }

    public static void palindromeString(String str){}
    public static void palindromeNumber(int num){}
}
