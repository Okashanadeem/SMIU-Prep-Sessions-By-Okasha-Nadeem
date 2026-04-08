# 02 Introduction to Java Applications, Input/Output & Operators

In this chapter, we focus on common data types, variables, and how to get user input from the console.

## Simple Explanation
Programs often need to store information and perform calculations. We use variables to store data and the `Scanner` class to get user input.

## Key Points
-   **Variables:** Containers for storing data (e.g., `int`, `double`, `String`).
-   **Arithmetic Operators:** Symbols used for calculations: `+`, `-`, `*`, `/`, `%`.
-   **Scanner:** A standard Java class used to read input from the user.
-   **Assignment Operator:** Use `=` to assign a value to a variable.

## Syntax Breakdown
```java
import java.util.Scanner; // Required for user input

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Initialize Scanner
        int number = input.nextInt(); // Read integer from user
        System.out.println(number); // Output the variable
    }
}
```

## Example 1: Addition
This program takes two integers from the user and displays their sum.

```java
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.println("Sum is " + sum);
    }
}
```

## Example 2: Comparison
Using comparison operators like `==`, `!=`, `<`, `>`, `<=`, `>=`.

```java
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();
        if (n1 == n2) {
            System.out.println("They are equal.");
        }
    }
}
```
