/*
 * array in java used to store multiple values in a single variable, instead of declaring separate variables for each value.
 * It is a data structure that can hold a fixed number of values of a single type.
 * The array is a collection of similar types of data items that have a contiguous memory location.
 * It is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.
 * To declare an array, define the variable type with square brackets [ ] :
 */

public class array {
  public static void main(String[] args) {
    String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
    System.out.println(cars[0]);

    String[] carss = { "Volvo", "BMW", "Ford", "Mazda" };
    carss[0] = "Opel";
    System.out.println(carss[0]);
    // Now outputs Opel instead of Volvo

    int[] myNum = { 10, 20, 30, 40 };
    System.out.println(myNum.length); // Outputs 4

    int[] myNumm = { 10, 20, 30, 40 };
    for (int i = 0; i < myNumm.length; i++) {
      System.out.println(myNumm[i]);
    } // Outputs 10, 20, 30, 40

    String[] myCars = { "Volvo", "BMW", "Ford" };
    for (String i : myCars) {
      System.out.println(i);
    } // Outputs Volvo, BMW, Ford

    int[] myNummm = { 10, 20, 30, 40 };
    for (int i : myNummm) {
      System.out.println(i);
    } // Outputs 10, 20, 30, 40

  }
}
