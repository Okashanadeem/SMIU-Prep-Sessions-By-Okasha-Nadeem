// A program that calculates the sum of two numbers provided by the user.
import java.util.Scanner; // import Scanner class for user input

public class Addition {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console window
        Scanner input = new Scanner(System.in);

        int number1; // first number to add
        int number2; // second number to add
        int sum;     // sum of number1 and number2

        System.out.print("Enter first integer: "); // prompt user
        number1 = input.nextInt(); // read first integer from user

        System.out.print("Enter second integer: "); // prompt user
        number2 = input.nextInt(); // read second integer from user

        sum = number1 + number2; // add numbers, then store total in sum

        System.out.printf("Sum is %d%n", sum); // display the sum
    }
}
