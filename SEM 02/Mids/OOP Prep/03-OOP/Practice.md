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
