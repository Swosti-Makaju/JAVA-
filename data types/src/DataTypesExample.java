/*
 * this is data type of java
 * int, float, double, char, boolean, byte, short, long
 * Primitive data types - includes byte, short, int, long, float, double,boolean and char
 * Non-primitive data types - such as String, Arrays and Classes
 * 
 * byte	- Stores whole numbers from -128 to 127
short - Stores whole numbers from -32,768 to 32,767
int -	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long - Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float -	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double -	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
boolean	- Stores true or false values
char -	Stores a single character/letter or ASCII values
 * 
 */



 public class DataTypesExample {
    public static void main(String[] args) {

        // 🔹 Primitive Data Types
        byte b = 100;                // 1 byte
        short s = 30000;             // 2 bytes
        int i = 100000;              // 4 bytes
        long l = 10000000000L;       // 8 bytes

        float f = 5.75f;             // 4 bytes
        double d = 19.99;            // 8 bytes

        char c = 'A';                // 2 bytes (Unicode)
        boolean bool = true;         // 1 bit (true/false)

        // 🔹 Non-Primitive Data Types
        String str = "Hello Baby ❤️";   // String (object)
        int[] numbers = {1, 2, 3, 4, 5}; // Array

        // Output
        System.out.println("=== Primitive Data Types ===");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        System.out.println("\n=== Non-Primitive Data Types ===");
        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");

            // Create variables of different data types
int items = 50;
float costPerItem = 9.99f;
float totalCost = items * costPerItem;
char currency = '$';

// Print variables
System.out.println("Number of items: " + items);
System.out.println("Cost per item: " + costPerItem + currency);
System.out.println("Total cost = " + totalCost + currency);
        }
    }
}

