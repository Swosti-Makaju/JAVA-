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
    }

}
