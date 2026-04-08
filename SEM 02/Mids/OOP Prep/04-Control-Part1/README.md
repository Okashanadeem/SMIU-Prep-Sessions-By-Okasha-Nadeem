# 04 Control Statements Part 1 (if, assignment, ++, --)

This chapter focuses on basic control flow and special operators for calculations.

## Simple Explanation
Control statements allow a program to make decisions. The `if` statement executes code only if a condition is true. We also use special operators like `++` (add 1) and `--` (subtract 1).

## Key Points
-   **If Statement:** Executes a block of code if a condition is true.
-   **If-Else Statement:** Executes one block if true, and another if false.
-   **Compound Assignment:** Shortcuts like `+=`, `-=`, `*=`, `/=`.
-   **Increment (++) / Decrement (--):** Adds or subtracts 1 from a variable.

## Syntax Breakdown
```java
if (score >= 60) {
    System.out.println("Passed");
} else {
    System.out.println("Failed");
}

int count = 1;
count++; // increment (count becomes 2)
count--; // decrement (count becomes 1)
```

## Example 1: Grade Decision
Using `if-else` to check a student's grade.

```java
import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int grade = input.nextInt();

        if (grade >= 60) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed.");
        }
    }
}
```

## Example 2: Increment Test
Difference between adding 1 before or after the variable.

```java
public class IncrementTest {
    public static void main(String[] args) {
        int c = 5;
        System.out.println(c);   // prints 5
        System.out.println(c++); // prints 5 (then increments)
        System.out.println(c);   // prints 6
        System.out.println(++c); // increments, then prints 7
    }
}
```
