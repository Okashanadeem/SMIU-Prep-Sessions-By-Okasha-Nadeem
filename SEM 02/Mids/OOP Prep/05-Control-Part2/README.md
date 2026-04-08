# 05 Control Statements Part 2 (loops, logical operators)

This chapter explains how to repeat code using loops and how to use logical operators for complex conditions.

## Simple Explanation
Loops allow a program to repeat a block of code multiple times. Logical operators let you combine multiple conditions, such as "if it's raining AND I have an umbrella."

## Key Points
-   **While Loop:** Repeats while a condition is true.
-   **For Loop:** Repeats a specific number of times.
-   **Do-While Loop:** Executes code at least once before checking the condition.
-   **Switch Statement:** Handles multiple specific values for a single variable.
-   **Logical Operators:** `&&` (AND), `||` (OR), `!` (NOT).

## Syntax Breakdown
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i); // prints 1 2 3 4 5
}

while (count < 10) {
    count++;
}

if (age > 18 && hasID == true) {
    System.out.println("Allowed");
}
```

## Example 1: Sum with For Loop
Adding integers from 1 to 10.

```java
public class ForLoop {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total += i;
        }
        System.out.println("Total is: " + total);
    }
}
```

## Example 2: Switch Statement
Handling different input values efficiently.

```java
import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day number (1-3): ");
        int day = input.nextInt();

        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid day"); break;
        }
    }
}
```
