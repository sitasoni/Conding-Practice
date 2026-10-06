package Basic;

import java.util.Scanner;

public class FibonaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        fibonaciSeries(num);
    }

    public static void fibonaciSeries(int num) {
        int a = 0, b = 1;

        int i = 0;
        while (i <= num) {
            int c = a + b;
            System.err.println(a);
            a = b;
            b = c;
            i++;
        }
    }
}
