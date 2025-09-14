/*
 * switch-case and ternary operator example
 * SWITH-CASE: used to select one of many code blocks to be executed.
 * TERNARY OPERATOR: used as a shortcut for the if statement.
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Today is Sunday.");
                break;
            case 2:
                System.out.println("Today is Monday.");
                break;
            case 3:
                System.out.println("Today is Tuesday.");
                break;
            case 4:
                System.out.println("Today is Wednesday.");
                break;
            case 5:
                System.out.println("Today is Thursday.");
                break;
            case 6:
                System.out.println("Today is Friday.");
                break;
            case 7:
                System.out.println("Today is Saturday.");
                break;
            default:
                System.out.println("Invalid day.");
        }

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        int food=4;
        String meal = (food < 5) ? "Breakfast" : (food < 11) ? "Lunch" : "Dinner";
        System.out.println(meal);

        int number = 10;
        switch (number) {
            case 10:
                System.out.println("Value is 10");
                break;
                case 11:
                System.out.println("Value is 11");
        
            default:
                break;
        }


    }
}
