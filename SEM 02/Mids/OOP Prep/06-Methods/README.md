# 06 Methods (deeper look, recursion, scope)

This chapter covers how to create custom methods, pass arguments, and return values.

## Simple Explanation
Methods are like small workers within your program. You give them a task (and some data), and they perform the task and might give you back a result.

## Key Points
-   **Static Method:** A method that can be called without creating an object (e.g., `Math.sqrt()`).
-   **Method Parameters:** Values you send into a method.
-   **Return Type:** The type of value the method sends back to you.
-   **Scope:** Where a variable can be seen and used in your code.
-   **Recursion:** A method that calls itself to solve a problem.

## Syntax Breakdown
```java
public static int square(int num) { // int return type, int parameter
    return num * num; // sends back the squared value
}
```

## Example 1: Finding Maximum
A method that compares three numbers and returns the largest.

```java
import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        double maxVal = maximum(10.5, 20.2, 15.1);
        System.out.println("Maximum is: " + maxVal);
    }

    public static double maximum(double x, double y, double z) {
        double max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }
}
```

## Example 2: Random Integers
Using the `Math` class or `Random` class for generating values.

```java
import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int face = 1 + randomNumbers.nextInt(6); // random number from 1 to 6
        System.out.println("Dice roll: " + face);
    }
}
```
