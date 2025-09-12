/*
 * MathDemo.java
 * A simple demonstration of Java's Math class.
 */


public class MathDemo {
    public static void main(String[] args) {
        int a = -25;
        double b = 16.0;
        double x = 5.7, y = 3.2;

        // Absolute value returns the absolute value of a number as a positive value
        System.out.println("Absolute of a: " + Math.abs(a));

        // Square root returns the square root of a number
        System.out.println("Square root of b: " + Math.sqrt(b));

        // Power returns the value of the first argument raised to the power of the second argument
        System.out.println("x raised to y: " + Math.pow(x, y));

        // Maximum and Minimum
        System.out.println("Max of x and y: " + Math.max(x, y));  //gets the maximum value
        System.out.println("Min of x and y: " + Math.min(x, y));  //gets the minimum value

        // Rounding
        System.out.println("Round of x: " + Math.round(x));
        System.out.println("Ceil of y: " + Math.ceil(y));   // round up
        System.out.println("Floor of y: " + Math.floor(y)); // round down

        // Random number between 0.0 and 1.0
        System.out.println("Random number: " + Math.random());  // generates a random number between 0.0 and 1.0
    }
}
