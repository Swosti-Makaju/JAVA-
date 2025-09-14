public class IfElseExample {
    public static void main(String[] args) {
        int age = 16;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        if(age % 2 == 0) {
            System.out.println(age + " is an even number.");
        } else {
            System.out.println(age + " is an odd number.");
        }

        int number = -5;
        if(number >= 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println(number + " is a negative number.");
        }

    }
}
