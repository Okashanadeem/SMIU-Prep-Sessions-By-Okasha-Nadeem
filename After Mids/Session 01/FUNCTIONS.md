# Session 1 – (Part 2): Using Functions to Structure Your C Programs

---

## 1. Introduction

As your programs grow larger, writing all the code inside `main()` becomes messy and hard to understand. Imagine reading a 500-line `main()` function—it would be confusing!

**Why break programs into functions?**

- **Clarity**: Each function does one specific task
- **Reusability**: Use the same function multiple times
- **Maintainability**: Easier to find and fix bugs
- **Collaboration**: Different people can work on different functions

### Role of `main()` as Program Controller

Think of `main()` as the **manager** of your program. It doesn't do all the work itself—it delegates tasks to specific-purpose functions.

```
main() → "Hey addFunc(), calculate sum for me"
       → "Hey userData(), get user information"
       → "Thanks, I'll use these results"
```

**Specific-purpose functions** improve readability by giving meaningful names to tasks. Instead of reading 20 lines of code, you read `calculateAverage()` and immediately understand what's happening.

---

## 2. Program Structure Overview

### Where Functions Are Written

A typical C program structure looks like this:

```c
#include <stdio.h>

// Function prototypes (declarations)
int addFunc(int a, int b);
void userData();

// main() function
int main() {
    // Call functions here
    return 0;
}

// Function definitions
int addFunc(int a, int b) {
    // Implementation
}

void userData() {
    // Implementation
}
```

### Function Prototypes

A **function prototype** tells the compiler:
- The function's name
- What type of value it returns
- What parameters it takes

```c
int addFunc(int a, int b);  // Returns int, takes two int parameters
void userData();             // Returns nothing, takes no parameters
```

**Why do we need prototypes?**

The C compiler reads your code from top to bottom. If you call a function before defining it, the compiler doesn't know it exists yet. Prototypes solve this problem.

### Relationship Between `main()` and Helper Functions

```
┌─────────────────┐
│     main()      │  ← Entry point (program starts here)
└────────┬────────┘
         │ calls
         ▼
┌─────────────────┐
│   addFunc()     │  ← Does specific task
└────────┬────────┘
         │ returns result
         ▼
┌─────────────────┐
│     main()      │  ← Continues execution
└─────────────────┘
```

### Execution Flow

1. Program starts at `main()`
2. `main()` calls a function (e.g., `addFunc()`)
3. Control jumps to that function
4. Function executes its code
5. Function returns a value (if applicable)
6. Control returns to `main()`
7. `main()` continues from where it left off

---

## 3. Example 1: `addFunc()`

### Purpose of `addFunc()`

This function takes two numbers and returns their sum. Instead of writing addition logic in `main()`, we create a dedicated function.

### Function Prototype

```c
int addFunc(int a, int b);
```

- **`int`** before the name means it returns an integer
- **`int a, int b`** means it takes two integer parameters

### Function Definition

```c
int addFunc(int a, int b) {
    int sum = a + b;
    return sum;  // Send result back to caller
}
```

### Returning a Value

The `return` statement sends data back to the function caller. Here, `sum` is sent back to `main()`.

### Calling `addFunc()` from `main()`

```c
int result = addFunc(10, 20);  // result will store 30
printf("Sum: %d\n", result);
```

### Complete Working Program

```c
#include <stdio.h>

// Function prototype
int addFunc(int a, int b);

int main() {
    int num1, num2, result;
    
    printf("Enter first number: ");
    scanf("%d", &num1);
    
    printf("Enter second number: ");
    scanf("%d", &num2);
    
    // Call the function
    result = addFunc(num1, num2);
    
    printf("Sum: %d\n", result);
    
    return 0;
}

// Function definition
int addFunc(int a, int b) {
    int sum = a + b;
    return sum;
}
```

**How it works:**
1. `main()` gets two numbers from the user
2. `main()` calls `addFunc(num1, num2)`
3. `addFunc()` calculates sum and returns it
4. `main()` stores the result and prints it

---

## 4. Example 2: `userData()`

### Purpose of `userData()`

This function collects user information and displays it. It demonstrates how functions can handle input/output operations.

### Taking User Input Inside a Function

Functions can perform any task—including reading data from the user.

### Passing Parameters

We can pass data **into** a function so it can work with that data.

```c
void userData(char name[], int age);
```

### Function Definition with Parameters

```c
void userData(char name[], int age) {
    printf("\n--- User Information ---\n");
    printf("Name: %s\n", name);
    printf("Age: %d\n", age);
}
```

**Note:** `void` means this function doesn't return any value—it just prints information.

### Calling `userData()` from `main()`

```c
char userName[50];
int userAge;

// Get data
printf("Enter your name: ");
scanf("%s", userName);

printf("Enter your age: ");
scanf("%d", &userAge);

// Call function
userData(userName, userAge);
```

### Complete Working Program

```c
#include <stdio.h>

// Function prototype
void userData(char name[], int age);

int main() {
    char userName[50];
    int userAge;
    
    printf("Enter your name: ");
    scanf("%s", userName);
    
    printf("Enter your age: ");
    scanf("%d", &userAge);
    
    // Call the function
    userData(userName, userAge);
    
    return 0;
}

// Function definition
void userData(char name[], int age) {
    printf("\n--- User Information ---\n");
    printf("Name: %s\n", name);
    printf("Age: %d\n", age);
}
```

**How it works:**
1. `main()` collects name and age
2. `main()` calls `userData()` with these values
3. `userData()` displays the formatted information
4. Control returns to `main()`
5. Program ends

---

## 5. Using Multiple Functions Together

Real programs use many functions working together. `main()` orchestrates them like a conductor leading an orchestra.

### Calling More Than One Function from `main()`

```c
#include <stdio.h>

int addFunc(int a, int b);
void userData(char name[], int age);

int main() {
    // Task 1: User information
    char name[50];
    int age;
    
    printf("Enter your name: ");
    scanf("%s", name);
    
    printf("Enter your age: ");
    scanf("%d", &age);
    
    userData(name, age);
    
    // Task 2: Addition
    int num1, num2, sum;
    
    printf("\nEnter two numbers to add: ");
    scanf("%d %d", &num1, &num2);
    
    sum = addFunc(num1, num2);
    printf("Sum: %d\n", sum);
    
    return 0;
}

int addFunc(int a, int b) {
    return a + b;
}

void userData(char name[], int age) {
    printf("\n--- User Information ---\n");
    printf("Name: %s\n", name);
    printf("Age: %d\n", age);
}
```

### Execution Order

Functions execute in the order they're called:

```
main() starts
  ↓
userData() executes
  ↓
main() continues
  ↓
addFunc() executes
  ↓
main() finishes
```

### Avoiding Global Variables

**Bad Practice:**
```c
int num1, num2;  // Global variables

void calculate() {
    printf("Sum: %d\n", num1 + num2);  // Uses global variables
}
```

**Good Practice:**
```c
void calculate(int a, int b) {
    printf("Sum: %d\n", a + b);  // Uses parameters
}
```

**Why avoid globals?**
- Hard to track which function changes them
- Makes debugging difficult
- Reduces function reusability

---

## 6. MCQs (Conceptual Understanding)

### Question 1
What is the primary role of `main()` in a well-structured program?

A) To perform all calculations  
B) To act as a program controller and delegate tasks  
C) To store all variables  
D) To define other functions  

---

### Question 2
What does a function prototype tell the compiler?

A) How to execute the function  
B) The function's name, return type, and parameters  
C) The memory location of the function  
D) The number of times the function will be called  

---

### Question 3
What happens when a function returns a value?

A) The program terminates  
B) The value is sent back to the caller  
C) All variables are deleted  
D) The function is called again  

---

### Question 4
Which of the following is a correct function call?

A) `int result = addFunc;`  
B) `result = addFunc(10, 20);`  
C) `addFunc() = result;`  
D) `call addFunc(10, 20);`  

---

### Question 5
What does `void` mean in a function declaration?

A) The function takes no parameters  
B) The function returns nothing  
C) The function is empty  
D) The function cannot be called  

---

### Question 6
In what order are functions executed?

A) Alphabetically by name  
B) In the order they're defined  
C) In the order they're called from `main()`  
D) Randomly by the compiler  

---

### Question 7
What is the benefit of using functions instead of writing everything in `main()`?

A) Programs run faster  
B) Code is more organized and reusable  
C) Less memory is used  
D) No need for variables  

---

### Question 8
What should you do if you call a function before defining it?

A) Move the function definition above `main()`  
B) Use a function prototype  
C) Rename the function  
D) Use global variables  

---

### Question 9
Why should you avoid global variables?

A) They use too much memory  
B) They make programs run slower  
C) They make code harder to debug and maintain  
D) The compiler doesn't allow them  

---

### Question 10
What does the following function do?
```c
int multiply(int x, int y) {
    return x * y;
}
```

A) Adds x and y  
B) Multiplies x and y and returns the result  
C) Prints x times y  
D) Divides x by y  

---

### Answers
1. B  
2. B  
3. B  
4. B  
5. B  
6. C  
7. B  
8. B  
9. C  
10. B  

---

## 7. Activities (Hands-On Thinking Tasks)

### Activity 1: Code Reading

**Predict the output of this program:**

```c
#include <stdio.h>

int doubleValue(int n);
void printMessage();

int main() {
    int number = 5;
    int result = doubleValue(number);
    
    printf("Result: %d\n", result);
    printMessage();
    
    return 0;
}

int doubleValue(int n) {
    return n * 2;
}

void printMessage() {
    printf("Program completed!\n");
}
```

**Questions:**
1. What will be printed first?
2. What is the value of `result`?
3. In what order are the functions called?

---

### Activity 2: Code Writing

**Task 1:** Write a function called `subtractFunc()` that:
- Takes two integers as parameters
- Returns their difference
- Is called from `main()` to subtract user-input numbers

**Task 2:** Write a function called `displayDetails()` that:
- Takes a name (string) and roll number (integer) as parameters
- Prints them in a formatted way
- Returns nothing

**Task 3:** Create a complete program that:
- Calls `subtractFunc()` to subtract two numbers
- Calls `displayDetails()` to show student information
- Both functions should be called from `main()`

---

### Activity 3: Code Improvement

**Given this poorly structured code:**

```c
#include <stdio.h>

int main() {
    int length, width, area, perimeter;
    
    printf("Enter length: ");
    scanf("%d", &length);
    
    printf("Enter width: ");
    scanf("%d", &width);
    
    area = length * width;
    perimeter = 2 * (length + width);
    
    printf("Area: %d\n", area);
    printf("Perimeter: %d\n", perimeter);
    
    return 0;
}
```

**Your task:**
1. Create a function `calculateArea()` that takes length and width, returns area
2. Create a function `calculatePerimeter()` that takes length and width, returns perimeter
3. Create a function `displayResults()` that takes area and perimeter, prints them
4. Rewrite the program using these three functions

---

## 8. Best Practices for Function Design

### One Task Per Function

Each function should do **one thing** and do it well.

**Good:**
```c
int calculateSum(int a, int b) {
    return a + b;
}

void printSum(int sum) {
    printf("Sum: %d\n", sum);
}
```

**Bad:**
```c
void doEverything(int a, int b) {
    int sum = a + b;
    int product = a * b;
    printf("Sum: %d, Product: %d\n", sum, product);
    // Too many responsibilities!
}
```

### Clear Naming

Function names should clearly describe what they do.

**Good names:**
- `calculateAverage()`
- `getUserInput()`
- `displayMenu()`
- `validatePassword()`

**Bad names:**
- `func1()`
- `doStuff()`
- `process()`
- `handle()`

### Minimal Responsibility

Keep functions short and focused. If a function is more than 20-30 lines, consider splitting it.

### Avoid Global Variables

Pass data through parameters and return values instead of using global variables.

```c
// Good: Uses parameters and return values
int calculate(int x, int y) {
    return x + y;
}

int main() {
    int result = calculate(5, 10);
    printf("Result: %d\n", result);
    return 0;
}
```

---

## 9. Common Mistakes

### Mistake 1: Writing Everything in `main()`

**Problem:**
```c
int main() {
    // 200 lines of code doing everything
    // Very hard to read and maintain
}
```

**Solution:** Break tasks into functions.

---

### Mistake 2: Forgetting Function Prototypes

**Problem:**
```c
int main() {
    int result = addFunc(5, 10);  // Error: addFunc not declared
    return 0;
}

int addFunc(int a, int b) {
    return a + b;
}
```

**Solution:** Add prototype before `main()`:
```c
int addFunc(int a, int b);  // Prototype
```

---

### Mistake 3: Using Unclear Names

**Problem:**
```c
int f1(int x) {  // What does f1 do?
    return x * 2;
}
```

**Solution:** Use descriptive names:
```c
int doubleValue(int number) {
    return number * 2;
}
```

---

### Mistake 4: Returning Incorrect Values

**Problem:**
```c
int calculateSum(int a, int b) {
    int sum = a + b;
    // Forgot to return!
}
```

**Solution:** Always return when function type is not `void`:
```c
int calculateSum(int a, int b) {
    int sum = a + b;
    return sum;  // Return the result
}
```

---

### Mistake 5: Mismatching Parameters

**Problem:**
```c
void printData(int age, char name[]) {
    printf("Name: %s, Age: %d\n", name, age);
}

int main() {
    printData("Alice", 20);  // Wrong order!
    return 0;
}
```

**Solution:** Match the order in function call:
```c
printData(20, "Alice");  // Correct order
```

---

## 10. Session Summary

### Key Takeaways

✅ **Functions organize code** into logical, reusable pieces  
✅ **`main()` acts as the controller**, calling other functions to do specific tasks  
✅ **Function prototypes** tell the compiler about functions before they're defined  
✅ **Parameters** allow you to send data into functions  
✅ **Return values** allow functions to send data back  
✅ **Avoid global variables**—use parameters and return values instead  
✅ **Clear naming** makes your code self-documenting  
✅ **One function = one task** keeps code maintainable  

---

### What's Next?

In future sessions, you'll learn:
- **Arrays with functions**: Passing arrays to functions
- **File handling**: Functions that read/write files
- **String manipulation**: Functions for text processing
- **Modular programming**: Breaking large programs into multiple files

---

### Practice Makes Perfect

The best way to master functions is to write them! Start small:
1. Convert your existing programs to use functions
2. Write functions for common tasks (input, calculation, output)
3. Gradually build larger programs using multiple functions

**Remember:** Good programmers don't write long programs—they write well-organized programs with many small, clear functions!

---

**End of Session 1 – Part 2**