package Beginner;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        int a = 10, b = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Plesae enter (+, -, *, /) : ");
        char cmd = sc.next().charAt(0);
        sc.close();

        switch (cmd) {
            case '+':
                System.out.println("Result : " + (a + b));
                break;

            case '-':
                System.out.println("Result : " + (a - b));

                break;

            case '*':
                System.out.println("Result : " + (a + b));
                break;

            case '/':
                System.out.println("Result : " + (a / b));
                break;

            default:
                System.out.println("invalid operator");
                break;
        }
    }
}
