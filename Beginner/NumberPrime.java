package Beginner;

public class NumberPrime {
    public static void main(String[] args) {
        int num = 5;
        boolean isPrime = true;

        for(int i = 2; i < num; i++ ){
            if(num % i == 0) 
                isPrime = false;
            break;
        }
        System.out.println(num + (isPrime? " is prime." : " is not prime."));


    }
}
