// Abstraction: Hiding implementation details.

abstract class Shape {
    abstract void draw(); // No body, just the idea
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a Square.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape s = new Square();

        c.draw();
        s.draw();
    }
}
