package Beginner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        int celsium = 25;
        double fahrenheit = (celsium * 9/5) + 32;
        System.out.println("Result : " + fahrenheit);

        /* 
Integer Division vs Floating-Point Division.       
Integer division
int 1
9 / 5 
The decimal part is discarded.

Floating-point division
double
1.8
9.0 / 5.0
The decimal part is preserved.
*/
    }
    
}
