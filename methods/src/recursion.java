public class recursion {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }
 // Example of a simple recursive method to count down from a number
    public static int countdown(int n) {
        if (n <= 0) {
            System.out.println("Done!");
            return n;
        } else {
            System.out.println(n);
            return countdown(n - 1);
        }
    }   

// Example of a recursive method to compute the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: return n if it's 0 or 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
        }
    }
    
}
