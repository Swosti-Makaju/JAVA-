public class javascope {
    {
        int x = 20;
        System.out.println(x); // prints 20
    }

    int x = 100; // instance variable

    {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi " + i);
        }
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x); // prints 10 (local variable)

        javascope obj = new javascope();
        System.out.println(obj.x); // prints 100 (instance variable)
    }
}
/*
 * class scope{
 * public class Main {
 * int x = 5; // Class variable
 * 
 * public static void main(String[] args) {
 * Main myObj = new Main();
 * System.out.println(myObj.x); // Accessible here
 * }
 * }
 * }
 */