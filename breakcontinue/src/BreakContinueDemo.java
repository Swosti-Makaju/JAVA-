/*
 * use of break and continue in loops
 * break - exits the loop entirely
 * continue - skips the current iteration and moves to the next
 */

public class BreakContinueDemo {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at i = " + i);
                break; // stop loop completely
            }
            System.out.println("i = " + i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skipping i = " + i);
                continue; // skip only this iteration
            }
            System.out.println("i = " + i);
        }

        for (int i = 1; i <= 10; i++) {

            // Skip 5 using continue
            if (i == 5) {
                System.out.println("Skipping number: " + i);
                continue; // skip only this iteration
            }

            // Stop loop completely at 8 using break
            if (i == 8) {
                System.out.println("Breaking the loop at: " + i);
                break; // exit the loop
            }

            // Normal execution
            System.out.println("Number: " + i);
        }
    }
}
