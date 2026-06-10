# ☕ Java Complete Study Guide
### OOP · Exception Handling · GUI (Swing) · Database (JDBC)

---

> **How to use this guide:** Every topic contains a concept explanation, full code with line-by-line comments, key rules to memorise, and exam-style questions at the end of each section.

---

## Table of Contents

1. [The 4 Pillars of OOP — Overview](#1-the-4-pillars-of-oop--overview)
2. [Pillar 1 — Encapsulation](#2-pillar-1--encapsulation)
3. [Pillar 2 — Inheritance](#3-pillar-2--inheritance)
4. [Pillar 3 — Polymorphism](#4-pillar-3--polymorphism)
5. [Pillar 4 — Abstraction](#5-pillar-4--abstraction)
6. [Method Overriding (Deep Dive)](#6-method-overriding-deep-dive)
7. [Abstract Classes (Deep Dive)](#7-abstract-classes-deep-dive)
8. [Exception Handling](#8-exception-handling)
9. [Java Swing – GUI Basics](#9-java-swing--gui-basics)
10. [Swing Components](#10-swing-components)
11. [Layouts in Swing](#11-layouts-in-swing)
12. [JDBC – Database Connectivity](#12-jdbc--database-connectivity)
13. [Full Project – Student Registration Form](#13-full-project--student-registration-form)
14. [Quick Revision Cheat Sheet](#14-quick-revision-cheat-sheet)
15. [Practice Questions](#15-practice-questions)

---

## 1. The 4 Pillars of OOP — Overview

**Object-Oriented Programming (OOP)** is a programming style that organises code around **objects** (real-world entities). Java is built on 4 core principles called the **4 Pillars of OOP**:

| # | Pillar | One-Line Definition | Key Keyword(s) |
|---|---|---|---|
| 1 | **Encapsulation** | Hide internal data; expose only what is needed | `private`, `get`, `set` |
| 2 | **Inheritance** | Child class acquires properties of parent class | `extends`, `super` |
| 3 | **Polymorphism** | One name, many forms | `@Override`, method overloading |
| 4 | **Abstraction** | Hide complexity; show only essentials | `abstract`, `interface` |

```
Real-world analogy:
─────────────────────────────────────────────────────────────
Encapsulation  → A medicine capsule hides the drug inside
Inheritance    → A child inherits traits from parents
Polymorphism   → A person acts differently as student/employee/friend
Abstraction    → A car driver uses the steering wheel without knowing the engine
```

---

## 2. Pillar 1 — Encapsulation

### 📖 Concept

**Encapsulation** means **wrapping data (fields) and methods together** inside a class, and **restricting direct access** to the data from outside. It protects the internal state of an object.

The rule is simple:
- Make fields `private` — no outsider can read/write them directly.
- Provide `public` **getter** and **setter** methods to control access.

```
private field  ──→  cannot be accessed from outside
public getter  ──→  allows READING the field safely
public setter  ──→  allows WRITING with validation
```

### 💻 Full Code with Comments

```java
// ── Encapsulated Class ───────────────────────────────────────────
class BankAccount {

    // private = hidden from outside world
    private String owner;
    private double balance;

    // Constructor to initialise the object
    public BankAccount(String owner, double balance) {
        this.owner   = owner;
        this.balance = balance;
    }

    // ── Getter Methods (READ access) ─────────────────────────────
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    // ── Setter Methods (WRITE access with validation) ─────────────
    public void setBalance(double amount) {
        if (amount < 0) {
            System.out.println("Error: Balance cannot be negative!");
        } else {
            balance = amount;   // only update if valid
        }
    }

    // ── Business Method ──────────────────────────────────────────
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void displayInfo() {
        System.out.println("Owner: "   + owner);
        System.out.println("Balance: " + balance);
    }
}

// ── Main Class ───────────────────────────────────────────────────
public class EncapsulationDemo {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Ali", 5000);

        // CORRECT — using public methods
        acc.displayInfo();

        acc.deposit(1500);           // adds to balance through method

        acc.setBalance(-100);        // rejected — negative not allowed
        acc.setBalance(7000);        // accepted

        System.out.println("Final Balance: " + acc.getBalance());

        // WRONG — would cause compile error (field is private):
        // acc.balance = 9999;       ← ERROR: balance has private access
    }
}
```

**Output:**
```
Owner: Ali
Balance: 5000.0
Deposited: 1500.0
Error: Balance cannot be negative!
Final Balance: 7000.0
```

### 🔑 Key Rules to Remember

- Always declare fields as `private`.
- Provide `public` getters/setters — getter returns value, setter changes it.
- Setters can include **validation logic** to prevent invalid data.
- Encapsulation = **data hiding** + **controlled access**.
- It makes code **secure**, **maintainable**, and **flexible**.

---

## 3. Pillar 2 — Inheritance

### 📖 Concept

**Inheritance** is the 2nd pillar of OOP. It allows one class (child / subclass) to acquire the properties and methods of another class (parent / superclass). It promotes **code reuse** and models real-world "is-a" relationships.

```
Syntax:
class SubClass extends SuperClass { ... }
```

| Term | Meaning |
|---|---|
| `extends` | Keyword to inherit a class |
| `super` | Refers to the parent class |
| `protected` | Access modifier — visible to subclasses |

### 💻 Full Code with Comments

```java
// ── Superclass ──────────────────────────────────────────────────
class Employee {
    // 'protected' means subclasses can access these directly
    protected String name;
    protected double salary;

    // A regular (concrete) method in the superclass
    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// ── Subclass ─────────────────────────────────────────────────────
// Manager "is-a" Employee → use extends
class Manager extends Employee {

    // This method sets values for inherited fields
    void setData(String n, double s) {
        name   = n;   // accessing 'protected' field from Employee
        salary = s;   // accessing 'protected' field from Employee
    }

    void showDetails() {
        super.displayInfo();  // calls the PARENT class method
        System.out.println("Role: Manager");
    }
}

// ── Main Class ───────────────────────────────────────────────────
public class TestInheritance {
    public static void main(String[] args) {
        Manager m = new Manager();  // object of subclass

        m.setData("Ahmed", 50000);  // sets name and salary
        m.showDetails();            // calls parent method + prints role
    }
}
```

**Output:**
```
Employee Name: Ahmed
Salary: 50000.0
Role: Manager
```

### 🔑 Key Rules to Remember

- A subclass **inherits** all `public` and `protected` members of the superclass.
- `private` members are **not** inherited.
- `super.methodName()` calls the parent version of a method.
- Java supports **single inheritance** only (one parent class), but a class can implement multiple interfaces.
- Every class in Java automatically inherits from `Object` class.

---

## 2. Method Overriding

### 📖 Concept

**Method Overriding** happens when a subclass provides its **own version** of a method already defined in the parent class — same name, same parameters, same return type.

This enables **runtime polymorphism**: the decision of which method to call is made at **run-time**, not compile-time.

### 💻 Full Code with Comments

```java
// ── Superclass ───────────────────────────────────────────────────
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// ── Subclass ─────────────────────────────────────────────────────
class Dog extends Animal {

    @Override           // annotation — tells the compiler we are overriding
    void sound() {
        // This is the OVERRIDDEN version — replaces parent's sound()
        System.out.println("Dog barks");
    }
}

// ── Main Class ───────────────────────────────────────────────────
public class OverrideDemo {
    public static void main(String[] args) {

        Animal a;          // reference of PARENT type
        a = new Dog();     // object is of CHILD type  ← Upcasting

        a.sound();         // Which sound() runs? → Dog's (decided at runtime)
    }
}
```

**Output:**
```
Dog barks
```

### 🔍 Why Does Dog's Method Run?

Even though `a` is declared as type `Animal`, the actual object is `Dog`. Java uses **dynamic dispatch** — it looks at the real object type at runtime and calls `Dog`'s `sound()`.

### 🔑 Key Rules to Remember

- Use `@Override` annotation — it's optional but **strongly recommended** (catches typos).
- Method signature must be **identical** (name + parameters + return type).
- Overriding requires an inheritance relationship (`extends`).
- You **cannot** override `static`, `final`, or `private` methods.
- Access level of overriding method can be same or **broader** (never narrower).

---

## 3. Abstract Classes

### 📖 Concept

An **abstract class** is a class that:
- **Cannot be instantiated** (you cannot do `new Shape()`)
- Acts as a **template/blueprint** for subclasses
- Can have **abstract methods** (no body — subclass MUST implement)
- Can have **concrete methods** (with full implementation)

```
abstract class ClassName {
    abstract void methodName();   // no body
    void normalMethod() { ... }   // has body
}
```

### 💻 Full Code with Comments

```java
// ── Abstract Class ───────────────────────────────────────────────
abstract class Shape {

    // Abstract method — NO body, NO curly braces
    // Every subclass MUST provide its own implementation
    abstract void draw();

    // Concrete method — HAS a body, inherited by all subclasses
    void message() {
        System.out.println("This is a shape");
    }
}

// ── Subclass 1 ───────────────────────────────────────────────────
class Circle extends Shape {
    // MUST override abstract method, otherwise compile error
    void draw() {
        System.out.println("Drawing Circle");
    }
}

// ── Subclass 2 ───────────────────────────────────────────────────
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// ── Main Class ───────────────────────────────────────────────────
public class AbstractDemo {
    public static void main(String[] args) {

        Shape s;           // reference variable of abstract type (allowed)

        s = new Circle();  // object is Circle (not Shape)
        s.draw();          // → Drawing Circle

        s = new Rectangle();
        s.draw();          // → Drawing Rectangle

        s.message();       // calling inherited concrete method
    }
}
```

**Output:**
```
Drawing Circle
Drawing Rectangle
This is a shape
```

### 🔑 Key Rules to Remember

- Declare with `abstract` keyword before `class`.
- If a class has even **one** abstract method → the class must be abstract.
- A subclass that doesn't implement ALL abstract methods must also be declared abstract.
- Abstract class **can** have constructors and instance variables.
- Abstract class **reference variable** is allowed; abstract class **object** is NOT.

---

## 4. Exception Handling

### 📖 Concept

An **exception** is an unexpected event that disrupts normal program flow. Java handles exceptions using `try-catch-finally` blocks.

| Keyword | Purpose |
|---|---|
| `try` | Block where exception might occur |
| `catch` | Handles the exception |
| `finally` | Always executes (cleanup code) |
| `throw` | Manually create/throw an exception |
| `throws` | Declares that a method may throw an exception |

### 📌 throw vs throws vs thrown

| Term | Type | Usage |
|---|---|---|
| `throw` | keyword | `throw new ArithmeticException("msg")` — manually triggers an exception |
| `throws` | keyword | `void check() throws IOException` — warns caller a method might throw |
| `thrown` | past tense | Describes an exception that has occurred (used in documentation) |

---

### 💻 Code 1 — Exception Thrown Automatically

```java
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // Dividing by zero → Java automatically throws ArithmeticException
        int result = a / b;        // Exception is THROWN here

        System.out.println(result); // This line is NEVER reached
    }
}
```

**Output:**
```
Exception in thread "main" java.lang.ArithmeticException: / by zero
```

---

### 💻 Code 2 — Manually Throwing an Exception (`throw`)

```java
public class Test {
    public static void main(String[] args) {
        int age = 15;

        // We manually check a condition and throw if violated
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
            // Execution stops here; exception travels up the call stack
        }

        System.out.println("Eligible"); // Only reached if age >= 18
    }
}
```

**Output:**
```
Exception in thread "main" java.lang.ArithmeticException: Not eligible to vote
```

---

### 💻 Code 3 — Declaring with `throws`

```java
class Test {
    // 'throws' tells callers: "this method might produce ArithmeticException"
    void check() throws ArithmeticException {
        int a = 10 / 0;   // exception will be thrown
    }
}
```

---

### 💻 Code 4 — Handling with try-catch (Best Practice)

```java
public class SafeDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;        // risky line
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            // Exception is caught here — program does NOT crash
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            // This block ALWAYS runs — for cleanup (closing files, etc.)
            System.out.println("Program continues safely.");
        }
    }
}
```

**Output:**
```
Error: / by zero
Program continues safely.
```

### 🔑 Key Rules to Remember

- Always wrap risky code in `try-catch` — prevents program crash.
- Multiple `catch` blocks are allowed for different exception types.
- `finally` runs even if no exception occurs.
- `throw` takes an **object** of an exception class.
- Custom exceptions can be created by extending `Exception` class.

---

## 5. Java Swing – GUI Basics

### 📖 Concept

**Java Swing** is Java's built-in library for creating **Graphical User Interfaces (GUI)** — windows, buttons, text fields, etc.

- Import: `import javax.swing.*;`
- Main window class: `JFrame`
- Runs on all platforms (platform-independent)
- Part of Java Standard Library (no extra installation needed)

### 💻 Code 1 — Empty Window

```java
import javax.swing.*;   // import all Swing classes

public class FirstGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My First Window"); // title in title bar

        frame.setSize(400, 300);          // width=400, height=300 pixels
        frame.setDefaultCloseOperation(   // what happens when X is clicked
            JFrame.EXIT_ON_CLOSE);        // → close the program
        frame.setVisible(true);           // make window appear
    }
}
```

---

### 💻 Code 2 — Window with Button and Label

```java
import javax.swing.*;

public class SecondGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Components Example");

        JButton button = new JButton("Click Me");   // a clickable button
        JLabel  label  = new JLabel("Hello Student"); // static text display

        frame.setLayout(null);  // null layout = we set positions manually

        // setBounds(x, y, width, height) — position from top-left corner
        button.setBounds(100, 100, 120, 30);
        label.setBounds (100,  50, 150, 30);

        frame.add(button);   // add button to frame
        frame.add(label);    // add label to frame

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
```

---

### 💻 Code 3 — Button Click Event (ActionListener)

```java
import javax.swing.*;
import java.awt.event.*;   // needed for ActionListener, ActionEvent

public class EventGUI {
    public static void main(String[] args) {

        JFrame  frame  = new JFrame("Event Example");
        JButton button = new JButton("Click Me");
        JLabel  label  = new JLabel();   // starts empty

        button.setBounds(100, 100, 120, 30);
        label.setBounds (100,  50, 200, 30);

        // Add a listener that fires when button is clicked
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // This code runs every time the button is pressed
                label.setText("Button Clicked!");
            }
        });

        frame.add(button);
        frame.add(label);
        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
```

---

### 💻 Code 4 — Reading Text Input

```java
import javax.swing.*;
import java.awt.event.*;

public class InputGUI {
    public static void main(String[] args) {

        JFrame     frame     = new JFrame("Input Example");
        JTextField textField = new JTextField();   // user types here
        JButton    button    = new JButton("Show");
        JLabel     label     = new JLabel();

        textField.setBounds(100,  50, 150, 30);
        button.setBounds   (100, 100, 100, 30);
        label.setBounds    (100, 150, 200, 30);

        // Lambda syntax (shorthand for ActionListener)
        button.addActionListener(e -> {
            String text = textField.getText();   // read user input
            label.setText("You entered: " + text);
        });

        frame.add(textField);
        frame.add(button);
        frame.add(label);
        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
```

---

### 💻 Code 5 — Helper Method Pattern (Clean Code)

```java
import javax.swing.*;
import java.awt.event.*;

public class EventGUI {

    // Separate method for button logic — cleaner, easier to maintain
    public static void buttonClicked(JLabel label) {
        label.setText("Button Clicked!");
    }

    public static void main(String[] args) {

        JFrame  frame  = new JFrame("Event Example");
        JButton button = new JButton("Click Me");
        JLabel  label  = new JLabel();

        button.setBounds(100, 100, 120, 30);
        label.setBounds (100,  50, 200, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClicked(label);   // call the separate method
            }
        });

        frame.add(button);
        frame.add(label);
        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

---

### 💻 Code 6 — Addition Calculator GUI

```java
import javax.swing.*;
import java.awt.event.*;

public class SumGUI {

    // Method receives all UI components and attaches the listener
    public static void addNumbers(JButton button,
                                  JTextField t1,
                                  JTextField t2,
                                  JTextField t3) {

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Integer.parseInt() converts String to int
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());

                int sum = num1 + num2;

                // String.valueOf() converts int back to String
                t3.setText(String.valueOf(sum));
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Addition Program");

        JLabel l1 = new JLabel("First Number");
        JLabel l2 = new JLabel("Second Number");
        JLabel l3 = new JLabel("Sum");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();   // displays result

        JButton button = new JButton("Add");

        // Position all components
        l1.setBounds(50,  50, 100, 30);
        t1.setBounds(160, 50, 120, 30);

        l2.setBounds(50,  100, 100, 30);
        t2.setBounds(160, 100, 120, 30);

        l3.setBounds(50,  150, 100, 30);
        t3.setBounds(160, 150, 120, 30);

        button.setBounds(120, 210, 100, 30);

        addNumbers(button, t1, t2, t3);   // attach event to button

        // Add all components to frame
        frame.add(l1); frame.add(t1);
        frame.add(l2); frame.add(t2);
        frame.add(l3); frame.add(t3);
        frame.add(button);

        frame.setLayout(null);
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

### 🔑 Key Rules to Remember

- `JFrame` = main window; `JButton` = button; `JLabel` = static text; `JTextField` = input box.
- `setBounds(x, y, width, height)` positions components (used with `setLayout(null)`).
- Always call `setVisible(true)` last — after adding all components.
- `addActionListener` attaches a click event to a button.
- `getText()` reads text; `setText(...)` writes text.

---

## 6. Swing Components

### 💻 Radio Buttons — Select One Option

```java
import javax.swing.*;
import java.awt.event.*;

public class RadioButtonExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Radio Button Example");
        JLabel label = new JLabel("Select Gender:");

        JRadioButton male   = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JButton      button = new JButton("Show");
        JTextField   result = new JTextField();

        // ButtonGroup ensures ONLY ONE radio button can be selected at a time
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        label.setBounds (50,  30, 120, 30);
        male.setBounds  (50,  70, 100, 30);
        female.setBounds(160, 70, 100, 30);
        button.setBounds(90, 120, 100, 30);
        result.setBounds(50, 170, 200, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (male.isSelected()) {
                    result.setText("Male Selected");
                } else if (female.isSelected()) {
                    result.setText("Female Selected");
                } else {
                    result.setText("No Option Selected");
                }
            }
        });

        frame.add(label); frame.add(male); frame.add(female);
        frame.add(button); frame.add(result);
        frame.setLayout(null);
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

**Key point:** `ButtonGroup` is NOT a visual component — it's a logical group. Radio buttons MUST be added to a `ButtonGroup` to enforce single selection.

---

### 💻 Check Boxes — Select Multiple Options

```java
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Check Box Example");
        JLabel label = new JLabel("Select Hobbies:");

        // JCheckBox allows MULTIPLE selections (unlike JRadioButton)
        JCheckBox cricket  = new JCheckBox("Cricket");
        JCheckBox football = new JCheckBox("Football");
        JCheckBox gaming   = new JCheckBox("Gaming");

        JButton    button = new JButton("Show");
        JTextField result = new JTextField();

        label.setBounds   (50,  30, 150, 30);
        cricket.setBounds (50,  70, 100, 30);
        football.setBounds(50, 110, 100, 30);
        gaming.setBounds  (50, 150, 100, 30);
        button.setBounds  (80, 200, 100, 30);
        result.setBounds  (50, 250, 250, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String hobbies = "";  // build result string

                // isSelected() returns true if checkbox is ticked
                if (cricket.isSelected())  hobbies += "Cricket ";
                if (football.isSelected()) hobbies += "Football ";
                if (gaming.isSelected())   hobbies += "Gaming ";

                result.setText(hobbies);
            }
        });

        frame.add(label);
        frame.add(cricket); frame.add(football); frame.add(gaming);
        frame.add(button); frame.add(result);
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

---

### 💻 Combo Box (Drop-down List)

```java
import javax.swing.*;
import java.awt.event.*;

public class ComboBoxExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Combo Box Example");
        JLabel label = new JLabel("Select Department:");

        // Array of items for the drop-down
        String[] departments = {"BSCS", "BBA", "BSE", "BSIT"};
        JComboBox combo = new JComboBox(departments);   // pass array to constructor

        JButton    button = new JButton("Show");
        JTextField result = new JTextField();

        label.setBounds (50,  40, 150, 30);
        combo.setBounds (180, 40, 120, 30);
        button.setBounds(100, 100, 100, 30);
        result.setBounds(50,  160, 250, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // getSelectedItem() returns Object — convert to String
                String selected = combo.getSelectedItem().toString();
                result.setText("Selected: " + selected);
            }
        });

        frame.add(label); frame.add(combo);
        frame.add(button); frame.add(result);
        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

---

### 💻 List Box (Scrollable Multi-item List)

```java
import javax.swing.*;
import java.awt.event.*;

public class ListBoxExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("List Box Example");
        JLabel label = new JLabel("Select Subject:");

        String[] subjects = {"Java", "Python", "PHP", "AI", "Cyber Security"};

        JList      list   = new JList(subjects);
        JScrollPane scroll = new JScrollPane(list);   // scrollable wrapper

        JButton    button = new JButton("Show");
        JTextField result = new JTextField();

        label.setBounds (50,  20, 150, 30);
        scroll.setBounds(50,  60, 150, 100);  // scrollpane (not list) is positioned
        button.setBounds(220, 80, 100, 30);
        result.setBounds(50, 200, 250, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = list.getSelectedValue().toString();
                result.setText("Selected: " + selected);
            }
        });

        frame.add(label); frame.add(scroll);
        frame.add(button); frame.add(result);
        frame.setLayout(null);
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

### 🔑 Component Comparison Table

| Component | Class | Select | Key Method |
|---|---|---|---|
| Radio Button | `JRadioButton` | One only | `isSelected()` |
| Check Box | `JCheckBox` | Many | `isSelected()` |
| Combo Box | `JComboBox` | One (dropdown) | `getSelectedItem()` |
| List Box | `JList` | One or many | `getSelectedValue()` |

---

## 7. Layouts in Swing

### 📖 Concept

A **Layout Manager** controls how components are **automatically arranged** inside a container, instead of manually setting `setBounds()`.

---

### 💻 FlowLayout — Left to Right

```java
import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Flow Layout");

        // FlowLayout places components left-to-right, wrapping to next row
        frame.setLayout(new FlowLayout());

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

---

### 💻 BorderLayout — Five Regions

```java
import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Border Layout");

        // BorderLayout divides window into 5 regions
        frame.setLayout(new BorderLayout());

        // Each component is placed in a specific region
        frame.add(new JButton("North"),  BorderLayout.NORTH);   // top
        frame.add(new JButton("South"),  BorderLayout.SOUTH);   // bottom
        frame.add(new JButton("East"),   BorderLayout.EAST);    // right
        frame.add(new JButton("West"),   BorderLayout.WEST);    // left
        frame.add(new JButton("Center"), BorderLayout.CENTER);  // middle (takes most space)

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

### 🔑 Layout Comparison

| Layout | Arrangement | Use Case |
|---|---|---|
| `null` (manual) | Developer sets exact `x,y` positions | Fixed-size forms |
| `FlowLayout` | Left → right, wraps | Simple toolbars |
| `BorderLayout` | 5 regions (N/S/E/W/Center) | Application frames |
| `GridLayout` | Even grid rows × cols | Calculator buttons |

---

## 8. JDBC – Database Connectivity

### 📖 Concept

**JDBC (Java Database Connectivity)** is an API that allows Java programs to connect to and interact with databases.

Key classes:
- `Connection` — represents the database connection
- `Statement` — runs SQL queries
- `PreparedStatement` — safer, prevents SQL injection
- `ResultSet` — holds query results (like a table)

---

### 💻 Code 1 — Connect to MS Access

```java
import java.sql.*;

public class AccessDemo {
    public static void main(String[] args) {

        try {
            // UCanAccess driver URL for MS Access
            String url = "jdbc:ucanaccess://D:/college.accdb";

            // Open connection
            Connection con = DriverManager.getConnection(url);

            // Create statement to run SQL
            Statement st = con.createStatement();

            // Execute SELECT query — result stored in ResultSet
            ResultSet rs = st.executeQuery("SELECT * FROM Student");

            // Loop through each row of results
            while (rs.next()) {
                System.out.println(
                    rs.getInt("ID")          // get integer column
                    + " "
                    + rs.getString("Name")); // get string column
            }

            con.close();   // always close connection when done

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

---

### 💻 Code 2 — Connect to SQL Server

```java
import java.sql.*;

public class SQLServerDemo {
    public static void main(String[] args) {

        try {
            // SQL Server connection URL
            String url = "jdbc:sqlserver://localhost:1433;"
                       + "databaseName=College;"
                       + "encrypt=true;"
                       + "trustServerCertificate=true";

            String user     = "sa";
            String password = "12345";

            // Pass URL + credentials to DriverManager
            Connection con = DriverManager.getConnection(url, user, password);

            Statement st  = con.createStatement();
            ResultSet rs  = st.executeQuery("SELECT * FROM Student");

            while (rs.next()) {
                System.out.println(rs.getInt("ID") + " " + rs.getString("Name"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

---

### 💻 Code 3 — INSERT with PreparedStatement

```java
// PreparedStatement is SAFER than Statement — use ? as placeholders
PreparedStatement ps = con.prepareStatement(
    "INSERT INTO Student(ID, Name) VALUES(?, ?)");

ps.setInt   (1, id);     // 1st ? = id (integer)
ps.setString(2, name);   // 2nd ? = name (string)

ps.executeUpdate();       // run the INSERT
```

**Why PreparedStatement?** It prevents **SQL Injection** attacks — user input cannot break the query structure.

### 🔑 Key Rules to Remember

- Always wrap JDBC code in `try-catch` (checked exceptions).
- `executeQuery()` → for SELECT (returns `ResultSet`).
- `executeUpdate()` → for INSERT, UPDATE, DELETE (returns rows affected count).
- Always call `con.close()` to release database resources.
- `rs.next()` moves to next row; returns `false` at the end.

---

## 9. Full Project – Student Registration Form

### 💻 Complete GUI + Database Application

```java
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class StudentForm {

    public static void main(String[] args) {

        // ── Build the GUI ────────────────────────────────────────
        JFrame frame = new JFrame("Student Registration");

        JLabel     lblId   = new JLabel("Student ID:");
        JLabel     lblName = new JLabel("Student Name:");
        JTextField txtId   = new JTextField();
        JTextField txtName = new JTextField();
        JButton    btnSave = new JButton("Save");

        // Position components
        lblId.setBounds  (50,  50, 100, 30);
        txtId.setBounds  (160, 50, 150, 30);
        lblName.setBounds(50, 100, 100, 30);
        txtName.setBounds(160,100, 150, 30);
        btnSave.setBounds(120,170, 100, 30);

        // ── Button Event ─────────────────────────────────────────
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    // Step 1: Read data from text fields
                    int    id   = Integer.parseInt(txtId.getText());
                    String name = txtName.getText();

                    // Step 2: Build connection string for SQL Server
                    String url = "jdbc:sqlserver://localhost:1433;"
                               + "databaseName=College;"
                               + "encrypt=true;"
                               + "trustServerCertificate=true";

                    // Step 3: Open connection
                    Connection con = DriverManager.getConnection(url, "sa", "12345");

                    // Step 4: Prepare INSERT statement with placeholders
                    PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO Student(ID, Name) VALUES(?, ?)");

                    ps.setInt   (1, id);
                    ps.setString(2, name);

                    ps.executeUpdate();   // Step 5: Execute INSERT

                    // Step 6: Show success message dialog
                    JOptionPane.showMessageDialog(frame, "Record Saved Successfully");

                    // Step 7: Clear fields for next entry
                    txtId.setText("");
                    txtName.setText("");

                    con.close();   // Step 8: Close connection

                } catch (Exception ex) {
                    // Show error in dialog box instead of crashing
                    JOptionPane.showMessageDialog(frame, ex.getMessage());
                }
            }
        });

        // ── Add Components to Frame ──────────────────────────────
        frame.add(lblId);   frame.add(txtId);
        frame.add(lblName); frame.add(txtName);
        frame.add(btnSave);

        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

### 🔍 How This Program Works — Step by Step

```
User fills txtId and txtName
        ↓
Clicks "Save" button
        ↓
ActionListener fires → actionPerformed() runs
        ↓
Reads ID and Name from text fields
        ↓
Opens connection to SQL Server database
        ↓
Prepares INSERT SQL with user values
        ↓
Executes INSERT → record saved in database
        ↓
Shows "Record Saved Successfully" dialog
        ↓
Clears text fields → ready for next entry
```

---

## 10. Quick Revision Cheat Sheet

### OOP Concepts

```
Inheritance      → extends keyword, superclass → subclass
                   super.method() calls parent method

Method Override  → same name + params in child class
                   @Override annotation recommended
                   Runtime polymorphism (dynamic dispatch)

Abstract Class   → cannot instantiate directly
                   abstract method = no body
                   subclass MUST implement all abstract methods
```

### Exception Keywords

```
try     → wrap risky code here
catch   → handle the exception
finally → always runs (cleanup)
throw   → manually throw: throw new ExceptionType("msg");
throws  → method declaration: void m() throws IOException
```

### Swing Components Quick Reference

```
JFrame        → main window
JLabel        → display text (non-editable)
JTextField    → single-line input
JButton       → clickable button
JRadioButton  → one-of-many selection (needs ButtonGroup)
JCheckBox     → many-of-many selection
JComboBox     → drop-down selection
JList         → scrollable list
JScrollPane   → scrollable wrapper for JList
JOptionPane   → popup dialog (showMessageDialog)
```

### JDBC Quick Reference

```java
// Connect
Connection con = DriverManager.getConnection(url, user, pass);

// Read data (SELECT)
ResultSet rs = con.createStatement().executeQuery("SELECT...");
while(rs.next()) { rs.getString("col"); rs.getInt("col"); }

// Write data (INSERT/UPDATE/DELETE)
PreparedStatement ps = con.prepareStatement("INSERT...");
ps.setInt(1, value); ps.setString(2, value);
ps.executeUpdate();

// Always close
con.close();
```

---

## 11. Practice Questions

### Section A — Inheritance & OOP

1. What is the difference between `public`, `protected`, and `private` access modifiers in the context of inheritance?
2. Can a subclass access a `private` field of its superclass directly? Explain.
3. Write a program with a `Vehicle` superclass (fields: `brand`, `speed`) and a `Car` subclass that adds a `doors` field.
4. What does `super()` do inside a subclass constructor?
5. What is the difference between **overloading** and **overriding**?

### Section B — Abstract Classes & Polymorphism

6. Can you create an object of an abstract class? Why or why not?
7. What happens if a subclass does not implement all abstract methods of its parent?
8. Create an abstract class `Appliance` with abstract method `powerOn()`. Create two subclasses: `Fan` and `TV`.
9. What is runtime polymorphism? Give an example with code.
10. Can an abstract class have a constructor? What is its purpose?

### Section C — Exception Handling

11. What is the difference between `throw` and `throws`?
12. Write a program that reads two numbers and catches a `NumberFormatException` if input is non-numeric.
13. In what order do `try`, `catch`, and `finally` execute?
14. Can there be multiple `catch` blocks? What order should they be in?
15. Write a custom exception class called `AgeException` that is thrown when age < 0.

### Section D — Java Swing

16. What is the purpose of `setLayout(null)`?
17. What is `setBounds(x, y, width, height)`? What does each parameter represent?
18. What is the difference between `JRadioButton` and `JCheckBox`?
19. Why must radio buttons be added to a `ButtonGroup`?
20. Modify the Addition program to also perform subtraction when a second button is clicked.
21. What is the difference between `JComboBox` and `JList`?
22. What does `frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)` do?

### Section D — JDBC

23. What is the difference between `Statement` and `PreparedStatement`?
24. What does `rs.next()` return and what does it do?
25. Write the JDBC code to **delete** a student record where ID = 5.
26. What is SQL Injection? How does `PreparedStatement` prevent it?
27. Why should `con.close()` always be called?
28. What is the difference between `executeQuery()` and `executeUpdate()`?

---

### 📝 Sample Exam Questions (Short Answer)

| Q | Answer |
|---|---|
| What keyword is used to inherit a class? | `extends` |
| What annotation is used for method overriding? | `@Override` |
| Can abstract class be instantiated? | No |
| Which exception is thrown on division by zero? | `ArithmeticException` |
| Which Swing class creates the main window? | `JFrame` |
| Which method reads text from a JTextField? | `getText()` |
| Which method sets text on a JLabel? | `setText(String)` |
| Which SQL method is safer: Statement or PreparedStatement? | `PreparedStatement` |
| Which JDBC method runs a SELECT query? | `executeQuery()` |
| Which JDBC method runs INSERT/UPDATE/DELETE? | `executeUpdate()` |

---

*End of Java Complete Study Guide — Good Luck on Your Exam! 🎯*