/*
 * for each loop is used to iterate through elements in an array or a collection without needing to manage an index variable.
 * The syntax of the for-each loop in Java is as follows:
 * for (dataType element : arrayOrCollection) {
 *    // code to be executed
 * }
 */

public class foreach {

    int[] numbers = { 10, 20, 30, 40, 50 };

    public static void main(String[] args) throws Exception {
        foreach obj = new foreach();
        // Using for-each loop to iterate through the array
        for (int num : obj.numbers) {
            System.out.println(num); // Print each number in the array
        }
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        for (String car : cars) {
            System.out.println(car);
        }
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        int number = 2;

        // Print the multiplication table for the number 2
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i; // Add each number to sum
        }
        System.out.println("Sum of first 100 natural numbers: " + sum);

        for (int seat = 1; seat <= 5; seat++) {
            System.out.println("Seat number: " + seat);
        }

        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " is " + fact);
        // Output: Factorial of 5 is 120

    }

}
