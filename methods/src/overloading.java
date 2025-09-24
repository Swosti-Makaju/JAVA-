public class overloading {
    static void myMethod(String fname) {
        System.out.println(fname + " Nielsen");
    }

    public static void main(String[] args) {
        myMethod("Henry"); // output: Henry Nielsen
        myMethod("Jenny"); // output: Jenny Nielsen
        myMethod("Anja"); // output: Anja Nielsen

    }

    static void myMethod(int age) {
        System.out.println(age + " years old");
    }

    public static void main1(String[] args) {
        myMethod(5); // output: 5 years old
        myMethod(8); // output: 8 years old
        myMethod(31); // output: 31 years old
    }

    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    public static void main2(String[] args) {
        myMethod("Liam", 5); // output: Liam is 5
        myMethod("Jenny", 8); // output: Jenny is 8
        myMethod("Anja", 31); // output: Anja is 31
    }

    static void myMethod1(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    static void myMethod1(int age, String fname) {
        System.out.println(fname + " is " + age);
    }

    public static void main3(String[] args) {
        myMethod1("Liam", 5); // output: Liam is 5
        myMethod1(8, "Jenny"); // output: Jenny is 8
        myMethod1("Anja", 31); // output: Anja is 31
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main4(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1); // output: int: 13
        System.out.println("double: " + myNum2); // output: double: 10.56
    }
}
