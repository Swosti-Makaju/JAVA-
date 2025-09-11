public class StringConcatSpecial {
    public static void main(String[] args) {
        String specialStr = "Special characters: ";
        char specialChar = '@';
        int specialNum = 100;

        // Concatenation of string, char, and number
        String result = specialStr + specialChar + " and number " + specialNum;
        System.out.println(result); // Output: Special characters: @ and number 100

        // Using += operator with special characters
        String message = "Symbols: ";
        message += '#'; // Concatenates the character '#' to the string
        message += " & ";
        message += '$'; // Concatenates the character '$' to the string
        System.out.println(message); // Output: Symbols: # & $

        // Demonstrating order of operations with special characters
        String combined = "Chars: " + (specialChar + specialNum); // Parentheses ensure addition happens first
        System.out.println(combined); // Output: Chars: 197 (ASCII value of '@' is 64, so 64 + 100 = 164)

        combined = "Chars: " + specialChar + specialNum; // Without parentheses, concatenation happens left to right
        System.out.println(combined); // Output: Chars: @100
    }
}
