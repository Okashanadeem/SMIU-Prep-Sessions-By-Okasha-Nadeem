# Practice Exercises - 03 OOP

### Question 1: Student Class
Create a `Student` class with a `String` instance variable named `name`. Provide methods to set and get the student's name.

### Code
```java
public class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

### Explanation
This is a basic Java class structure. The `name` variable is private, meaning it can only be accessed through the `setName` and `getName` methods.

---

### Question 2: Using the Student Class
Write a test program that creates a `Student` object, sets the name to "Ali", and then prints the name.

### Code
```java
public class StudentTest {
    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.setName("Ali");
        System.out.println("The student's name is " + myStudent.getName());
    }
}
```

### Output
```
The student's name is Ali
```

### Explanation
We instantiate the `Student` class using `new Student()`, call the `setName` method to store a value, and then use `getName` to retrieve and print it.

---

### Question 3: Adding a Second Variable
Modify the `Student` class to include an `int` variable for `age`. Add set and get methods for `age`.

### Code
```java
public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
```

### Explanation
We add another private variable `age` and two more methods (`setAge` and `getAge`) to manage this data.

---

### Question 4: Displaying Multiple Objects
Create two `Student` objects with different names and ages, then display both.

### Code
```java
public class StudentGroup {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Sara");
        s1.setAge(20);

        Student s2 = new Student();
        s2.setName("Hamza");
        s2.setAge(22);

        System.out.printf("%s is %d years old.%n", s1.getName(), s1.getAge());
        System.out.printf("%s is %d years old.%n", s2.getName(), s2.getAge());
    }
}
```

### Output
```
Sara is 20 years old.
Hamza is 22 years old.
```

### Explanation
Each object (`s1` and `s2`) stores its own set of values for `name` and `age`.

---

### Question 5: Simple Constructor
Add a constructor to the `Student` class that allows you to initialize the name when the object is created.

### Code
```java
public class Student {
    private String name;

    // Constructor
    public Student(String studentName) {
        name = studentName;
    }

    public String getName() {
        return name;
    }
}

// Test Class
public class ConstructorTest {
    public static void main(String[] args) {
        Student s = new Student("Zain");
        System.out.println("Student name: " + s.getName());
    }
}
```

### Output
```
Student name: Zain
```

### Explanation
A constructor is called automatically when an object is created. It's used to initialize the object's data immediately.

---

### Question 6: Encapsulation
Create a `BankAccount` class with a `private double balance`. Provide `deposit()` and `getBalance()` methods.

### Code
```java
public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
```

### Explanation
By making `balance` private, we prevent direct modification. The `deposit` method ensures that only positive amounts can be added.

---

### Question 7: Inheritance
Create a `Vehicle` class with a method `honk()`. Create a `Car` class that inherits from `Vehicle`.

### Code
```java
class Vehicle {
    void honk() {
        System.out.println("Beep beep!");
    }
}

class Car extends Vehicle {
    // Car inherits honk()
}

public class TestInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
    }
}
```

### Explanation
The `Car` class uses `extends` to get all behaviors from the `Vehicle` class, demonstrating code reuse.

---

### Question 8: Polymorphism
Create a `Bird` class with a method `fly()`. Override `fly()` in a `Penguin` class to say "I cannot fly".

### Code
```java
class Bird {
    void fly() {
        System.out.println("Flying high!");
    }
}

class Penguin extends Bird {
    @Override
    void fly() {
        System.out.println("I cannot fly, but I can swim!");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Bird b = new Penguin();
        b.fly(); // Calls Penguin's version
    }
}
```

### Explanation
Even though the variable type is `Bird`, the actual object is a `Penguin`, so the overridden method is called.

---

### Question 9: Abstraction
Create an `abstract class Appliance` with an `abstract void turnOn()`. Create a `Fan` class that implements it.

### Code
```java
abstract class Appliance {
    abstract void turnOn();
}

class Fan extends Appliance {
    void turnOn() {
        System.out.println("Fan is spinning.");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Appliance myFan = new Fan();
        myFan.turnOn();
    }
}
```

### Explanation
Abstraction allows us to define *what* an appliance should do (turn on) without specifying *how* every appliance does it.
