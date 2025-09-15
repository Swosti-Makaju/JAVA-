public class eg {
    public static void main(String[] args) {
        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");

        int dice = 1;
      
          while(dice<=6)
          {
              if (dice < 6) {
                  System.out.println("No Yatzy.");
              } else {
                  System.out.println("Yatzy!");
              }
              dice = dice + 1;
          }
    }

} 

/*
 * A loop is a programming construct that allows you to repeat a block of code
 * multiple times.
 * Loops are used to automate repetitive tasks and can help make your code more
 * efficient and easier to read.
 * There are several types of loops in Java, including:
 * 1. for loop
 * 2. while loop
 * 3. do-while loop
 */
