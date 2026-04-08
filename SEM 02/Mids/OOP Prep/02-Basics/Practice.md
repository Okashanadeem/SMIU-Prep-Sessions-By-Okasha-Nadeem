# Practice Exercises - 02 Basics

### Question 1: Product of Three Integers
Write a program that asks the user to enter three integers and displays their product.

### Code
```java
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z, result;

        System.out.print("Enter first integer: ");
        x = input.nextInt();
        System.out.print("Enter second integer: ");
        y = input.nextInt();
        System.out.print("Enter third integer: ");
        z = input.nextInt();

        result = x * y * z;
        System.out.printf("Product is %d%n", result);
    }
}
```

### Output
```
Enter first integer: 2
Enter second integer: 3
Enter third integer: 4
Product is 24
```

### Explanation
The program uses `Scanner` to read three integers and then multiplies them together using the `*` operator.

---

### Question 2: Simple Arithmetic
Write a program that takes two numbers and displays their sum, difference, and quotient.

### Code
```java
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = input.nextInt();

        System.out.println("Sum: " + (n1 + n2));
        System.out.println("Difference: " + (n1 - n2));
        System.out.println("Quotient: " + (n1 / n2));
    }
}
```

### Output
```
Enter number 1: 10
Enter number 2: 5
Sum: 15
Difference: 5
Quotient: 2
```

### Explanation
We use simple arithmetic operators `+`, `-`, and `/` to perform calculations on the two input numbers.

---

### Question 3: Area of a Square
Write a program that takes the side length of a square and calculates its area (side * side).

### Code
```java
import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side length: ");
        int side = input.nextInt();
        int area = side * side;
        System.out.println("Area is: " + area);
    }
}
```

### Output
```
Enter side length: 5
Area is: 25
```

### Explanation
The area is calculated by multiplying the side length by itself.

---

### Question 4: Remainder Operator
Write a program that takes two numbers and shows the remainder of the first divided by the second.

### Code
```java
import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int num1 = input.nextInt();
        System.out.print("Enter divisor: ");
        int num2 = input.nextInt();
        System.out.println("Remainder is: " + (num1 % num2));
    }
}
```

### Output
```
Enter dividend: 10
Enter divisor: 3
Remainder is: 1
```

### Explanation
The `%` operator returns the remainder after division. 10 divided by 3 is 3 with a remainder of 1.

---

### Question 5: Floating Point Addition
Write a program that adds two decimal (double) numbers.

### Code
```java
import java.util.Scanner;

public class DoubleAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal 1: ");
        double d1 = input.nextDouble();
        System.out.print("Enter decimal 2: ");
        double d2 = input.nextDouble();
        System.out.println("Total: " + (d1 + d2));
    }
}
```

### Output
```
Enter decimal 1: 5.5
Enter decimal 2: 2.3
Total: 7.8
```

### Explanation
We use the `double` data type for numbers with decimal points and `input.nextDouble()` to read them.
