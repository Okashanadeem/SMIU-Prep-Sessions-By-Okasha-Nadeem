// Inheritance: Reusing code from a parent class.

class Person {
    void eat() {
        System.out.println("This person is eating.");
    }
}

// Student inherits from Person
class Student extends Person {
    void study() {
        System.out.println("This student is studying.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.eat();   // Inherited method
        s.study(); // Subclass method
    }
}
