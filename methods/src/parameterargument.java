public class parameterargument {
    static void myMethod(String fname) {
        System.out.println(fname + " Nielsen");
    }

    public static void main(String[] args) {
        myMethod("Henry"); //output: Henry Nielsen 
        myMethod("Jenny"); //output: Jenny Nielsen
        myMethod("Anja"); //output: Anja Nielsen
        
    }
}
