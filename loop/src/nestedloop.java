/*
 * Nested loops are loops that exist within another loop. They are used to perform repeated actions within the context of another repeated action.
 * The syntax of nested loops in Java is as follows:    
 * for (initialization; condition; increment/decrement) {
 *     for (initialization; condition; increment/decrement) {   
 *        // code to be executed
 *    }
 */

public class nestedloop {
    public static void main(String[] args) throws Exception {

        // Nested for loop to print a 5x5 grid of asterisks
        for (int i = 1; i <= 5; i++) { // Outer loop for rows
            for (int j = 1; j <= 5; j++) { // Inner loop for columns
                System.out.print("* "); // Print asterisk without newline
            }
            System.out.println(); // Move to the next line after each row
        }

        // Nested while loop to print a 3x3 grid of numbers
        int row = 1;
        while (row <= 3) { // Outer loop for rows
            int col = 1;
            while (col <= 3) { // Inner loop for columns
                System.out.print(col + " "); // Print column number without newline
                col++;
            }
            System.out.println(); // Move to the next line after each row
            row++;
        }

        // Nested do-while loop to print a 2x4 grid of letters
        int r = 1;
        do {
            int c = 1;
            do {
                System.out.print((char) ('A' + c - 1) + " "); // Print letters A, B, C, D
                c++;
            } while (c <= 4);
            System.out.println(); // Move to the next line after each row
            r++;
        } while (r <= 2);
    }
}
