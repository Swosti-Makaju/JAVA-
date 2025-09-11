public class StringConcatNumbers {
    public static void main(String[] args) {
        String str = "The answer is: ";
        int answer = 42;

        // Concatenation of string and number
        String result = str + answer;
        System.out.println(result); // Output: The answer is: 42

        // Using += operator
        String message = "I have ";
        message += 3; // Concatenates the number 3 to the string
        message += " apples.";
        System.out.println(message); // Output: I have 3 apples.

        // Demonstrating order of operations
        String combined = "Sum: " + (5 + 10); // Parentheses ensure addition happens first
        System.out.println(combined); // Output: Sum: 15

        combined = "Sum: " + 5 + 10; // Without parentheses, concatenation happens left to right
        System.out.println(combined); // Output: Sum: 510
    }
}
