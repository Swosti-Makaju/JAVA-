public class parameterargument {
    static void myMethod(String fname) {
        System.out.println(fname + " Nielsen");
    }

    public static void main(String[] args) {
        myMethod("Henry"); // output: Henry Nielsen
        myMethod("Jenny"); // output: Jenny Nielsen
        myMethod("Anja"); // output: Anja Nielsen

    }

    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main1(String[] args) {
        checkAge(20); // output: Access granted - You are old enough!
        checkAge(17); // output: Access denied - You are not old enough!
        checkAge(18); // output: Access granted - You are old enough!
    }

    // multiple parameters
    static void myMethod2(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    public static void main2(String[] args) {
        myMethod2("Liam", 5); // output: Liam is 5
        myMethod2("Jenny", 8); // output: Jenny is 8
        myMethod2("Anja", 31); // output: Anja is 31
    }

    // return value
    static int myMethod3(int x) {
        return 5 + x;
    }

    public static void main3(String[] args) {
        System.out.println(myMethod3(3)); // output: 8
        System.out.println(myMethod3(5)); // output: 10
        System.out.println(myMethod3(7)); // output: 12
    }

    //else if 
    static void checkAge1(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else if (age == 18) {
            System.out.println("Congratulations on your first year of adulthood!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main4(String[] args) {
        checkAge1(20); // output: Access granted - You are old enough!
        checkAge1(18); // output: Congratulations on your first year of adulthood!
        checkAge1(17); // output: Access denied - You are not old enough!
    }

    
}
