/*
 * while loop is used to repeat a block of code as long as a specified condition is true.
 * The syntax of a while loop in Java is as follows:
 * while (condition) {
 *     // code to be executed
 * }
 */

public class whileloop {
    public static void main(String[] args) throws Exception {

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }

        int k = 1;
        while (k <= 10) {   
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        }

        int age = 18;
        while (age <= 60) {
            System.out.println("You can work");
            age++;
        }
    }
}
