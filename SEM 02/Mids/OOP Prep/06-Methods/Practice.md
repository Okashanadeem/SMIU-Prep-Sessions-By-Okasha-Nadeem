# Practice Exercises - 06 Methods

### Question 1: Square Method
Write a static method called `square` that takes an integer and returns its square.

### Code
```java
public class MathTools {
    public static void main(String[] args) {
        int result = square(5);
        System.out.println("Square is: " + result);
    }

    public static int square(int x) {
        return x * x;
    }
}
```

### Output
```
Square is: 25
```

### Explanation
The `square` method is defined as `static` so it can be called directly from `main`. It returns the result of `x * x`.

---

### Question 2: Sum of Two Doubles
Write a method that takes two `double` parameters and returns their sum.

### Code
```java
public class Calculator {
    public static void main(String[] args) {
        double total = add(4.5, 5.5);
        System.out.println("Total: " + total);
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
```

### Output
```
Total: 10.0
```

### Explanation
The method `add` takes two floating-point numbers and returns a `double` result.

---

### Question 3: Minimum of Three
Write a method that finds the minimum of three integers.

### Code
```java
public class MinFinder {
    public static void main(String[] args) {
        int min = minimum(10, 5, 8);
        System.out.println("Minimum: " + min);
    }

    public static int minimum(int a, int b, int c) {
        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        return smallest;
    }
}
```

### Output
```
Minimum: 5
```

### Explanation
We assume the first number is the smallest, then compare it with the other two, updating the `smallest` variable if a smaller value is found.

---

### Question 4: Even Check Method
Write a method `isEven` that returns `true` if a number is even and `false` otherwise.

### Code
```java
public class LogicTools {
    public static void main(String[] args) {
        System.out.println("Is 4 even? " + isEven(4));
        System.out.println("Is 7 even? " + isEven(7));
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
```

### Output
```
Is 4 even? true
Is 7 even? false
```

### Explanation
The method returns a `boolean` (true/false) based on the result of the remainder operation.

---

### Question 5: Simple Recursion
Write a recursive method to calculate the sum of numbers from `n` down to 1.

### Code
```java
public class RecursionDemo {
    public static void main(String[] args) {
        int result = sum(5);
        System.out.println("Sum is: " + result);
    }

    public static int sum(int n) {
        if (n == 1) { // Base case
            return 1;
        } else {
            return n + sum(n - 1); // Recursive call
        }
    }
}
```

### Output
```
Sum is: 15
```

### Explanation
Recursion is when a method calls itself. Here, `sum(5)` becomes `5 + sum(4)`, and so on, until it reaches the base case `sum(1)`.
