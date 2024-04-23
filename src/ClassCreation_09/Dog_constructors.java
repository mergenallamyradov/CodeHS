package ClassCreation_09;

public class Dog_constructors {
    // Attribute
    String name;

    // Constructor
    public Dog_constructors(String dogName) {
        name = dogName;
    }

    // Method to display the name
    void display() {
        System.out.println("My name is " + name);
    }
    // Main class
    public static void main(String[] args) {
        // Creating an object of the Dog class and passing the name through constructor
        Dog_constructors myDog = new Dog_constructors("Buddy");

        // Displaying the name using the method
        myDog.display();
    }
}


