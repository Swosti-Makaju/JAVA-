/*
 * for loop is used to repeat a block of code a specific number of times.
 * The syntax of a for loop in Java is as follows:
 * for (initialization; condition; increment/decrement) {
 *     // code to be executed
 * }
 */

public class forloop {
    public static void main(String[] args) throws Exception {

        // Print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);  //output: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        }

        // Print numbers from 10 to 1
        for (int j = 10; j >= 1; j--) {
            System.out.println(j); //output: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
        }

        // Print even numbers from 1 to 10
        for (int k = 1; k <= 10; k++) {
            if (k % 2 == 0) {
                System.out.println(k); //output: 2, 4, 6, 8, 10
            }
        }

        // Print "You can work" for ages from 18 to 60
        for (int age = 18; age <= 60; age++) {
            System.out.println("You can work"); //output: You can work
        }
    }
}
