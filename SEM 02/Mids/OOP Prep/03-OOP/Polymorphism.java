// Polymorphism: One method name, many behaviors.

class Animal {
    void speak() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog says: Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("The cat says: Meow!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Parent reference, Dog object
        Animal myCat = new Cat(); // Parent reference, Cat object

        myDog.speak(); // Executes Dog's version
        myCat.speak(); // Executes Cat's version
    }
}
