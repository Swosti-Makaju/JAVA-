/*
 * BOOLEAN DATA TYPE IN JAVA
 * Boolean data type represents one of two values: true or false.
 * It is commonly used for conditional statements and logical operations.
 */

public class BooleanDemo {
    public static void main(String[] args) {
        // Boolean variables
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);

        // Boolean expressions
        int x = 10;
        int y = 20;

        System.out.println("x < y: " + (x < y));   // true
        System.out.println("x > y: " + (x > y));   // false
        System.out.println("x == 10: " + (x == 10)); // true
        System.out.println("y != 10: " + (y != 10)); // true

        // Using booleans in if condition
        if (x < y) {
            System.out.println("x is smaller than y");
        } else {
            System.out.println("x is greater than or equal to y");
        }
    }
}
