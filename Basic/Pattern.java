package Basic;

import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        // RightAlignedRightAngleTriangle(num);
        LeftAlignedRightAngleTriangle(num);
    }

    public static void RightAlignedRightAngleTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void LeftAlignedRightAngleTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void FullPyramid() {
    }

    public static void IntegernvertedPyramid() {
    }

    public static void Diamondpattern() {
    }

    public static void HollowSquare() {
    }

    public static void HollowTriangle() {
    }

    public static void HollowDiamond() {
    }

    public static void SquentialNumberTriangle() {
    }

    public static void FloydsTriangle() {
    }

    public static void PascalsTriangle() {
    }

    public static void RowRepeatingLetters() {
    }

    public static void AlphabetIncrementingTriangles() {
    }

    public static void ButterflyPattern() {
    }

    public static void HourglassPattern() {
    }

}
