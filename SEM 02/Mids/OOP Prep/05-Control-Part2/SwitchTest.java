// Using the switch statement to count letter grades.
import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your numeric grade (0-100): ");
        int grade = input.nextInt();

        // switch statement to determine letter grade
        switch (grade / 10) {
            case 9:  // grade was between 90
            case 10: // and 100, inclusive
                System.out.println("A");
                break; // exits switch
            case 8:  // grade was between 80 and 89
                System.out.println("B");
                break; // exits switch
            case 7:  // grade was between 70 and 79
                System.out.println("C");
                break; // exits switch
            case 6:  // grade was between 60 and 69
                System.out.println("D");
                break; // exits switch
            default: // grade was less than 60
                System.out.println("F");
                break; // optional; will exit switch anyway
        }
    }
}
