/*
 * java variable are containers for storing data values.
 * In java, there are different types of variables, for example:
 * - String - storing text like "Hello"
 * - int    - storing whole numbers like 123 or -123
 * - float  - storing fractional numbers like 19.99 or -19.99
 * - char   - storing single characters like 'a' or 'B'
 * - boolean  - storing values with two states: true or false
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String name = "Java"; // String variable
        System.out.println(name); // Output: Java
        System.out.println("Hello" + name);

        int myNum = 15; // Integer variable
        System.out.println(myNum); // Output: 15

        int MyNum = 15;
        MyNum = 20; // myNum is now 20
        System.out.println(MyNum); // Output: 20

        float myFloatNum = 5.99f;
        System.out.println(myFloatNum); // Output: 5.99

        char myLetter = 'D';
        System.out.println(myLetter); // Output: D

        boolean myBool = true;
        System.out.println(myBool); // Output: true

        String myText = "Hello";
        System.out.println(myText); // Output: Hello

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

      
    }
}
