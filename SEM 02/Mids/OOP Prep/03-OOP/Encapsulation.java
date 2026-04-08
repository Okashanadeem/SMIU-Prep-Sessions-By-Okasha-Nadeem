// Encapsulation: Hiding data using private fields and public methods.

class Student {
    private String name; // private variable (hidden)

    // Public setter method
    public void setName(String newName) {
        this.name = newName;
    }

    // Public getter method
    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Okasha"); // Controlled access
        System.out.println("Student Name: " + s.getName());
    }
}
