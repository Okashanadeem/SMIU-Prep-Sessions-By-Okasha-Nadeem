# Practice Exercises - 01 Intro

### Question 1: Hello Java
Write a program that prints "Hello, Java!" to the console.

### Code
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

### Output
```
Hello, Java!
```

### Explanation
This is a standard Java program structure. The `System.out.println` statement displays the string "Hello, Java!" in the console.

---

### Question 2: Two Lines of Text
Write a program that prints "I am learning Java." on one line and "It is fun!" on the next line.

### Code
```java
public class TwoLines {
    public static void main(String[] args) {
        System.out.println("I am learning Java.");
        System.out.println("It is fun!");
    }
}
```

### Output
```
I am learning Java.
It is fun!
```

### Explanation
Each `println` call outputs its text and then moves to the next line.

---

### Question 3: Simple Greeting
Write a program that uses `System.out.print` twice to print "Good Morning " and "Students" on the same line.

### Code
```java
public class Greeting {
    public static void main(String[] args) {
        System.out.print("Good Morning ");
        System.out.print("Students");
    }
}
```

### Output
```
Good Morning Students
```

### Explanation
`System.out.print` does not move to the next line after printing, so the second call prints right after the first one.

---

### Question 4: Star Pattern
Write a program that prints three stars in a vertical column using `println`.

### Code
```java
public class StarColumn {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
    }
}
```

### Output
```
*
*
*
```

### Explanation
Each call to `println` puts a single star on its own line.

---

### Question 5: Star Row
Write a program that prints three stars in a horizontal row using `print`.

### Code
```java
public class StarRow {
    public static void main(String[] args) {
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
    }
}
```

### Output
```
***
```

### Explanation
Using `print` keeps all output on the same line.
