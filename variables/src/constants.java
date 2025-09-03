public class constants {
    public static void main(String[] args) {
        final int myNum = 15; // constant value, cannot be changed
        // myNum = 20; // will generate an error
        System.out.println(myNum); // Output: 15

        // Student data
        String studentName = "Alice Smith";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);
    }
}
