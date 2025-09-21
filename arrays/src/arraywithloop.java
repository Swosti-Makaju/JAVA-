public class arraywithloop {

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        // For loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " = " + numbers[i]);
        }

        // Enhanced for-each loop
        System.out.println("Using for-each loop:");
        for (int n : numbers) {
            System.out.println(n);
        }

        // While loop
        System.out.println("Using while loop:");
        int j = 0;
        while (j < numbers.length) {
            System.out.println("Element at index " + j + " = " + numbers[j]);
            j++;
        }

        // Do-while loop
        System.out.println("Using do-while loop:");
        int k = 0;
        do {
            System.out.println("Element at index " + k + " = " + numbers[k]);
            k++;
        } while (k < numbers.length);

        // An array storing different ages
        int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };

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

        int[] number = { 45, 12, 98, 33, 27 };

        int max = number[0];
        int min = number[0];

        for (int n : number) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        int[] num = { 5, 10, 15, 20, 25 };
        int target = 15;
        boolean found = false;  
        for (int n : num) {
            if (n == target) {
                found = true;
                break;  
            }
        }
        if (found) {
            System.out.println(target + " is found in the array.");
        } else {
            System.out.println(target + " is not found in the array.");
        }

        // Enhanced for loop to iterate through an array of strings
        String[] fruits = { "Apple", "Banana", "Cherry", "Date" };
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
    }
}
