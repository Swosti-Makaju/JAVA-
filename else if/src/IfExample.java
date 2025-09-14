/*
 * if statement example
 */

public class IfExample {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18) {
            System.out.println("You are eligible to vote."); //you can change the value of age to test the condition . output will change accordingly
        }
        int number = 10; 
        if (number % 2 == 0) {
            System.out.println(number + " is an even number."); // This block will execute because the condition is true
        }
        if(number>0){
            System.out.println(number + " is a positive number."); // This block will execute because the condition is true
        }
    }
}
