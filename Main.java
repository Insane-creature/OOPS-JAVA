public class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to be overridden by subclasses
    public void speak() {
        System.out.println("This animal makes a sound");
    }
}

public class Dog extends Animal {

    // Constructor
    public Dog(String name) {
        super(name); // Call the constructor of the superclass
    }

    // Override the speak method
    @Override
    public void speak() {
        System.out.println(getName() + " says Woof!");
    }
}

public class Cat extends Animal {

    // Constructor
    public Cat(String name) {
        super(name); // Call the constructor of the superclass
    }

    // Override the speak method
    @Override
    public void speak() {
        System.out.println(getName() + " says Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        myDog.speak(); // Outputs: Buddy says Woof!
        myCat.speak(); // Outputs: Whiskers says Meow!
    }
}
