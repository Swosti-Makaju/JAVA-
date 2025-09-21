public class MultiArrayDemo {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Element at row 2, column 3: " + matrix[1][2]);
        System.out.println("Element at row 3, column 1: " + matrix[2][0]);
        System.out.println("Element at row 1, column 2: " + matrix[0][1]);
        System.out.println("Element at row 3, column 3: " + matrix[2][2]);
        System.out.println("Element at row 1, column 1: " + matrix[0][0]);  

        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
myNumbers[1][2] = 9;
System.out.println(myNumbers[1][2]); // Outputs 9 instead of 8

int[][] myNumberss = { {1, 4, 2}, {3, 6, 8, 5, 2} };

System.out.println("Rows: " + myNumberss.length);             // 2
System.out.println("Cols in row 0: " + myNumberss[0].length); // 3
System.out.println("Cols in row 1: " + myNumberss[1].length); // 5

String[][] cars = {
  { "Volvo", "BMW", "Ford" },
    { "Mazda", "Toyota", "Honda" }
};
System.out.println(cars[0][0]); // Outputs Volvo
System.out.println(cars[0][1]); // Outputs BMW  
System.out.println(cars[0][2]); // Outputs Ford
System.out.println(cars[1][0]); // Outputs Mazda
System.out.println(cars[1][1]); // Outputs Toyota
System.out.println(cars[1][2]); // Outputs Honda


int[][] arr = { {1, 2, 3}, {4, 5} };
System.out.println(arr[0][2]); // Outputs 3
System.out.println(arr[1][1]); // Outputs 5
    }
}
