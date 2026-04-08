# 03 Classes, Objects, Methods & Strings

This chapter introduces the core concepts of Object-Oriented Programming (OOP) in Java.

## Simple Explanation
A **Class** is like a blueprint for an object. An **Object** is an instance of that class. For example, a "Car" class is a blueprint, and "Your Car" is the real object.

## Key Points
-   **Class:** Defines attributes (data) and behaviors (methods).
-   **Object:** A specific instance of a class.
-   **Instance Variables:** Data stored in each object.
-   **Methods:** Actions that an object can perform.
-   **Constructor:** A special method used to initialize objects.

## The 4 Pillars of OOP
1.  **Encapsulation:** Hiding the internal data of an object and only allowing access through public methods (getters/setters). This keeps the data safe.
2.  **Inheritance:** Allowing a new class to inherit fields and methods from an existing class. It helps in reusing code.
3.  **Polymorphism:** The ability of a single method to perform different tasks based on the object that calls it. (e.g., a "speak" method for a Dog vs. a Cat).
4.  **Abstraction:** Hiding complex implementation details and showing only the essential features of an object. We use abstract classes or interfaces for this.

## Syntax Breakdown
```java
public class MyClass { // Class name
    private String name; // Instance variable

    public void setName(String name) { // Method
        this.name = name;
    }

    public String getName() { // Method
        return name;
    }
}
```

## Example 1: Account Class
A simple class that stores a name.

```java
public class Account {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

## Example 2: Account Test
How to create and use an object of the `Account` class.

```java
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.setName("John Doe");
        System.out.println("Name is: " + myAccount.getName());
    }
}
```
