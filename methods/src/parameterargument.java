public class parameterargument {
    static void myMethod(String fname) {
        System.out.println(fname + " Nielsen");
    }

    public static void main(String[] args) {
        myMethod("Henry"); //output: Henry Nielsen 
        myMethod("Jenny"); //output: Jenny Nielsen
        myMethod("Anja"); //output: Anja Nielsen
        
    }
    //multiple parameters
    static void myMethod2(String fname, int age) {
        System.out.println(fname + " is " + age);
    }
    public static void main2(String[] args) {
        myMethod2("Liam", 5); //output: Liam is 5
        myMethod2("Jenny", 8); //output: Jenny is 8
        myMethod2("Anja", 31); //output: Anja is 31
    }
}
