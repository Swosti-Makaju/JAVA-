public class eg {
     public static void main(String[] args) {
    int[] numbers = {3, -1, 7, 0, 9};

    for (int n : numbers) {
      if (n < 0) {
        continue; // skip negative numbers
      }
      if (n == 0) {
        break; // stop loop when zero is found
      }
      System.out.println(n);
    }

    // An array storing different ages
int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

float avg, sum = 0;

// Get the length of the array
int length = ages.length;

// Loop through the elements of the array
for (int age : ages) {
  sum += age;
}

// Calculate the average by dividing the sum by the length
avg = sum / length;

// Print the average
System.out.println("The average age is: " + avg);


// Enhanced for loop to iterate through an array of strings
String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
for (String fruit : fruits) {
    System.out.println(fruit);
  }

  // Enhanced for loop to iterate through an array of doubles
  double[] prices = {19.99, 29.99, 39.99};
  for (double price : prices) {
      System.out.println(price);
    }
}
}
