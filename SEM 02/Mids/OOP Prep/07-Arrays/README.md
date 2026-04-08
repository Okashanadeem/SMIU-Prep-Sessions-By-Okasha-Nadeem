# 07 Arrays and ArrayLists

This chapter introduces data structures for storing multiple values in a single variable.

## Simple Explanation
An **Array** is a group of variables (called elements) that all have the same type. For example, a list of student grades. An **ArrayList** is a similar structure but it can grow and shrink in size automatically.

## Key Points
-   **Element:** An individual value in an array.
-   **Index:** The position of an element in an array (starts at 0).
-   **Size:** The number of elements an array can hold.
-   **Enhanced for loop:** A simplified way to iterate through all elements.
-   **ArrayList:** A class that provides a more flexible way to manage collections of objects.

## Syntax Breakdown
```java
int[] numbers = new int[5]; // Declare and create array
numbers[0] = 10; // Assign value to first element

ArrayList<String> list = new ArrayList<>(); // Create ArrayList
list.add("Apple"); // Add element
```

## Example 1: Summing an Array
Adding all elements in an integer array.

```java
public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        System.out.println("Total sum: " + total);
    }
}
```

## Example 2: ArrayList Operations
Adding, removing, and printing items from an `ArrayList`.

```java
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        System.out.println("Colors list: " + colors);
        System.out.println("Size: " + colors.size());
    }
}
```
