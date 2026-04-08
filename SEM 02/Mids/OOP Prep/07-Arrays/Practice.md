# Practice Exercises - 07 Arrays

### Question 1: Initialize and Print
Create an array of 5 integers and print all elements using a `for` loop.

### Code
```java
public class ArrayPrint {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Element at index " + i + ": " + nums[i]);
        }
    }
}
```

### Output
```
Element at index 0: 1
Element at index 1: 2
Element at index 2: 3
Element at index 3: 4
Element at index 4: 5
```

### Explanation
We initialize the array with curly braces and use `nums.length` to ensure the loop runs for all elements.

---

### Question 2: Array Average
Calculate the average value of elements in an integer array.

### Code
```java
public class ArrayAverage {
    public static void main(String[] args) {
        int[] values = {10, 20, 30};
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        double avg = (double) sum / values.length;
        System.out.println("Average: " + avg);
    }
}
```

### Output
```
Average: 20.0
```

### Explanation
We use an enhanced `for` loop to sum the values, then divide by the length of the array to get the average.

---

### Question 3: Finding an Element
Write a program that searches for a specific number in an array and prints its index.

### Code
```java
public class ArraySearch {
    public static void main(String[] args) {
        int[] data = {5, 12, 8, 20, 3};
        int search = 20;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == search) {
                System.out.println("Found " + search + " at index " + i);
            }
        }
    }
}
```

### Output
```
Found 20 at index 3
```

### Explanation
We iterate through the array and use an `if` statement to check if the current element matches our search value.

---

### Question 4: ArrayList Basics
Create an `ArrayList` of integers, add three numbers, and print the list.

### Code
```java
import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        System.out.println("List: " + numbers);
    }
}
```

### Output
```
List: [100, 200, 300]
```

### Explanation
`ArrayList` is dynamic, so we use the `add()` method to insert new elements. Printing the list object directly shows its contents in brackets.

---

### Question 5: Modifying an ArrayList
Add 3 names to an `ArrayList`, remove the second name, and print the final list.

### Code
```java
import java.util.ArrayList;

public class NameList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Sara");
        names.add("Zain");

        names.remove(1); // Removes "Sara" (index 1)
        System.out.println("Final list: " + names);
    }
}
```

### Output
```
Final list: [Ali, Zain]
```

### Explanation
`remove(1)` deletes the element at index 1. The elements following it are shifted to the left to fill the gap.
