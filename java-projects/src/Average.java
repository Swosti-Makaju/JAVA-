/*program for calculating student's average score */
import java.util.Scanner;

public class Average {
    static char gradeFunction(double avg){
        if(avg>=90) return 'A';
        else if(avg>=80) return 'B';
        else if(avg>=70) return 'C';
        else if(avg>=60) return 'D';
        else return 'F';
    }
    public static void main(String[] args) throws Exception {
       Scanner scanner=new Scanner(System.in);
       System.out.print("Enter the number of subjects: ");
         int n=scanner.nextInt();
            double sum=0;
            for(int i=1;i<=n;i++){
                System.out.print("Enter the score of subject "+i+": ");
                double score=scanner.nextDouble();
                sum+=score;
            }
            double avg=sum/n;
            char grade=gradeFunction(avg);  
            System.out.printf("The average score is: %.2f\n",avg);
            System.out.println("The grade is: "+grade);
            scanner.close();
    }
}
