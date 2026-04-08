// Using the if-else control statement to determine a student's grade.
import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
        // create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);

        System.out.print("Enter grade (0-100): ");
        int studentGrade = input.nextInt();

        // if student's grade is 60 or higher
        if (studentGrade >= 60) {
            System.out.println("Passed");
        } else {
            // grade is less than 60
            System.out.println("Failed");
        }
    }
}
