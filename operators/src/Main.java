/*
 * operator in java 
 * operators are used to perform operations on variables and values
 * there are different types of operators in java
 * arithmetic operators
 * assignment operators
 * comparison operators
 * logical operators
 * bitwise operators
 */

 public class Main {
  public static void main(String[] args) {

 int a = 10, b = 3;

        // Arithmetic
        System.out.println("a + b = " + (a + b));
        System.out.println("a % b = " + (a % b));

        // Relational
        System.out.println("a > b = " + (a > b));

        // Logical
        System.out.println("(a > 5 && b < 5) = " + (a > 5 && b < 5));

        // Assignment
        a += 2; 
        System.out.println("a after += 2: " + a);

        // Unary
        System.out.println("++b = " + (++b));

        // Ternary
        String result = (a > b) ? "a is bigger" : "b is bigger";
        System.out.println(result);

    int sum1 = 100 + 50;
    int sum2 = sum1 + 250;
    int sum3 = sum2 + sum2;
    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);  

     int x = 10;
    int y = 3;

    System.out.println(x + y); // 13
    System.out.println(x - y); // 7
    System.out.println(x * y); // 30
    System.out.println(x / y); // 3
    System.out.println(x % y); // 1

    int z = 5;
    ++z;
    System.out.println(z); // 6
    --z;
    System.out.println(z); // 5

     int aaa = 10;
    int bbb = 3;
    System.out.println(aaa / bbb);   // Integer division, result is 3

    double c = 10.0d;
    double d = 3.0d;
    System.out.println(c / d);   // Decimal division, result is 3.333...
    
    
  }
}
