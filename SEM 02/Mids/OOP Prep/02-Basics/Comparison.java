// Using if statements, relational operators, and equality operators.
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        // create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);

        int number1; // first number to compare
        int number2; // second number to compare

        System.out.print("Enter first integer: "); // prompt user
        number1 = input.nextInt(); // read first integer from user

        System.out.print("Enter second integer: "); // prompt user
        number2 = input.nextInt(); // read second integer from user

        if (number1 == number2) {
            System.out.printf("%d == %d%n", number1, number2);
        }

        if (number1 != number2) {
            System.out.printf("%d != %d%n", number1, number2);
        }

        if (number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2);
        }

        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);
        }
    }
}
