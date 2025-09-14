public class NestedIfExample {
    public static void main(String[] args) {
        int age = 25;
        boolean hasVoterID = true;

        if (age >= 18) {
            if (hasVoterID) {
                System.out.println("You can vote.");
            } else {
                System.out.println("You need a voter ID to vote.");
            }
        } else {
            System.out.println("You are too young to vote.");
        }

        int number = -10;
        if (number != 0) {
            if (number > 0) {
                System.out.println(number + " is a positive number.");
            } else {
                System.out.println(number + " is a negative number.");
            }
        } else {
            System.out.println("The number is zero.");
        }

        int marks = 85;
        if (marks >= 50) {
            if (marks >= 75) {
                System.out.println("Grade: A");
            } else {
                System.out.println("Grade: B");
            }
        } else {
            System.out.println("Grade: Fail");
        }

        int day = 4;
        if (day >= 1 && day <= 7) {
            if (day == 1) {
                System.out.println("Sunday");
            } else if (day == 2) {
                System.out.println("Monday");
            } else if (day == 3) {
                System.out.println("Tuesday");
            } else if (day == 4) {
                System.out.println("Wednesday");
            } else if (day == 5) {
                System.out.println("Thursday");
            } else if (day == 6) {
                System.out.println("Friday");
            } else {
                System.out.println("Saturday");
            }
        } else {
            System.out.println("Invalid day number.");
        }
    }
}
