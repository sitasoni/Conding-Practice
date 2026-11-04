package Beginner;

public class NumberSum {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("Result : " + sum);

        System.out.println("Result alternate way : " + (n * (n + 1)/2));
    }
}
