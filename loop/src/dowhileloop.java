public class dowhileloop {
    public static void main(String[] args) throws Exception {

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        int j = 10;
        do {
            System.out.println(j);
            j--;
        } while (j >= 1);

        int k = 1;
        do {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        } while (k <= 10);

        int age = 18;
        do {
            System.out.println("You can work");
            age++;
        } while (age <= 60);
    }
}
