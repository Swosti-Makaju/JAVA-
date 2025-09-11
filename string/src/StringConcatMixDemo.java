public class StringConcatMixDemo  {
         public static void main(String[] args) {
        // Numbers with strings
        int x = 5, y = 7;
        System.out.println("Without parentheses: " + x + y); // 57
        System.out.println("With parentheses: " + (x + y));  // 12

        // Numbers in between strings
        System.out.println("Result = " + x + " + " + y + " = " + (x + y));

        // Special characters
        String dumpling = "🥟";
        String yummy = "😋";
        System.out.println("I love eating " + dumpling + yummy + " dumplings!"); // I love eating 🥟😋 dumplings!

        // Mixing everything
        System.out.println("Total Price: $" + (x * y) + " only!");// Total Price: $35 only!
         }
}
    