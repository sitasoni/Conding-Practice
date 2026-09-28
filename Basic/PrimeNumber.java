package Basic;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        // isPrimeNumber(num);
        // countPrimeTillN(num);
        printAllPrimeTillN(num);
    }

    public static void isPrimeNumber(int num) {
        if (num <= 1) {
            System.err.println(num + " is not prime number...");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.err.println(num + " is prime number.");
        else
            System.err.println(num + " is not prime number.");
    }

    public static void countPrimeTillN(int num) {
        if (num <= 1) {
            System.err.println(" Please valid number...");
            return;
        }
        int count = 0;
        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                count++;
        }
        System.err.println("Total prime number is : " + count);
    }

    public static void printAllPrimeTillN(int num) {
        if (num <= 1) {
            System.err.println("Please enter valid number");
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j<= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                list.add(i);
        }
        System.err.println("List size is : " + list.size());
        for (Integer item : list) {
            System.out.print(item + ", ");
        }
    }

}