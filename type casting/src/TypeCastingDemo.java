/*
type casting in java 
it is when you assign a value of one data type to another data type
    for example int to double
    *there are two types of type casting
    1. implicit/widening type casting (automatic type conversion)
    2. explicit/narrowing type casting (manual type conversion)
 */


public class TypeCastingDemo {
    public static void main(String[] args) {

        // 🔹 Widening Casting (small → big) - automatic
        int intNum = 25;
        double doubleNum = intNum;  // int → double
        System.out.println("Widening Casting:");
        System.out.println("int value: " + intNum);
        System.out.println("double value (after casting): " + doubleNum);

        System.out.println();

        // 🔹 Narrowing Casting (big → small) - manual
        double d = 9.87;
        int i = (int) d;  // double → int
        System.out.println("Narrowing Casting:");
        System.out.println("double value: " + d);
        System.out.println("int value (after casting): " + i);
    }
}
