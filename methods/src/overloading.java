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
    
}
