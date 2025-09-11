/*
 * string in java 
 * This program demonstrates various string operations in Java.
 * It includes string concatenation, using the += operator, 
 * string comparison with equals and compareTo methods, 
 * and other common string methods.
 */

public class StringOperators {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Baby ❤️";

        // Concatenation
        System.out.println(s1 + " " + s2);

        // += operator
        String msg = "Hi ";
        msg += "Darling!";
        System.out.println(msg);

        // equals
        System.out.println("Hello".equals("hello")); // false
        System.out.println("Hello".equalsIgnoreCase("hello")); // true

        // compareTo
        System.out.println("Apple".compareTo("Banana")); // -1

        // Other
        String text = "Teerak";
        System.out.println("Length: " + text.length());
        System.out.println("Upper: " + text.toUpperCase());
        System.out.println("Char at 2: " + text.charAt(2));
    }
}
