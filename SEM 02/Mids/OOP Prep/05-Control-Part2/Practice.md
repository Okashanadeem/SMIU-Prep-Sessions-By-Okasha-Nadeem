# Practice Exercises - 05 Control Part 2

### Question 1: Print 1 to 10
Write a `for` loop that prints numbers from 1 to 10.

### Code
```java
public class PrintTen {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}
```

### Output
```
1 2 3 4 5 6 7 8 9 10 
```

### Explanation
The loop starts with `i = 1`, continues while `i <= 10`, and increments `i` by 1 after each iteration.

---

### Question 2: Sum with While Loop
Write a `while` loop to calculate the sum of numbers from 1 to 5.

### Code
```java
public class WhileSum {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 5) {
            sum += i;
            i++;
        }
        System.out.println("Sum is: " + sum);
    }
}
```

### Output
```
Sum is: 15
```

### Explanation
The `while` loop checks the condition `i <= 5` before every iteration. The variable `i` is manually incremented inside the loop.

---

### Question 3: Logical AND (&&)
Write a program that prints "Eligible" if a person's age is between 18 and 60 (inclusive).

### Code
```java
import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();

        if (age >= 18 && age <= 60) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
```

### Output
```
Enter age: 25
Eligible
```

### Explanation
The `&&` operator ensures that *both* conditions must be true for the message "Eligible" to print.

---

### Question 4: Multiples of 3
Write a `for` loop that prints multiples of 3 from 3 to 15.

### Code
```java
public class Multiples {
    public static void main(String[] args) {
        for (int i = 3; i <= 15; i += 3) {
            System.out.print(i + " ");
        }
    }
}
```

### Output
```
3 6 9 12 15 
```

### Explanation
By using `i += 3`, we jump by 3 in each step of the loop.

---

### Question 5: Simple Menu
Create a `switch` statement for a simple menu: 1 for "Start", 2 for "Exit".

### Code
```java
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Start\n2. Exit\nChoice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1: System.out.println("Starting..."); break;
            case 2: System.out.println("Exiting..."); break;
            default: System.out.println("Invalid choice"); break;
        }
    }
}
```

### Output
```
1. Start
2. Exit
Choice: 1
Starting...
```

### Explanation
The `switch` statement compares `choice` to each `case` and executes the matching block. `break` prevents the code from falling into the next case.
