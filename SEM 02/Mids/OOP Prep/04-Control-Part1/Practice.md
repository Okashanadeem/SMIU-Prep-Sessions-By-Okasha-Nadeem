# Practice Exercises - 04 Control Part 1

### Question 1: Check Positive/Negative
Write a program that takes an integer and tells if it is positive or negative.

### Code
```java
import java.util.Scanner;

public class SignCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
```

### Output
```
Enter a number: -5
Negative
```

### Explanation
We use the `if-else` statement to check if the number is greater than or equal to zero.

---

### Question 2: Simple Counter
Start a variable at 10, then use the decrement operator `--` twice and print the result.

### Code
```java
public class DecrementDemo {
    public static void main(String[] args) {
        int counter = 10;
        counter--; // becomes 9
        counter--; // becomes 8
        System.out.println("Counter is: " + counter);
    }
}
```

### Output
```
Counter is: 8
```

### Explanation
The `--` operator reduces the value of the variable by 1 each time it is used.

---

### Question 3: Even or Odd
Write a program that tells if a number is even or odd using the remainder operator `%`.

### Code
```java
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
```

### Output
```
Enter a number: 7
Odd
```

### Explanation
If a number is divisible by 2 with no remainder (`num % 2 == 0`), it is even; otherwise, it is odd.

---

### Question 4: Score Message
Write a program that prints "Great Job" if a score is above 90, otherwise "Keep Practicing".

### Code
```java
import java.util.Scanner;

public class ScoreMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = input.nextInt();

        if (score > 90) {
            System.out.println("Great Job");
        } else {
            System.out.println("Keep Practicing");
        }
    }
}
```

### Output
```
Enter score: 92
Great Job
```

### Explanation
A simple `if-else` block to output a message based on the input score.

---

### Question 5: Compound Interest Shortcut
Use a compound assignment operator `*=` to double the value of a variable `amount = 5`.

### Code
```java
public class Multiplier {
    public static void main(String[] args) {
        int amount = 5;
        amount *= 2; // same as amount = amount * 2
        System.out.println("New amount: " + amount);
    }
}
```

### Output
```
New amount: 10
```

### Explanation
The `*=` operator multiplies the variable by the given value and updates the variable in one step.
