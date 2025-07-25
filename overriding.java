// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Subclass Cow
class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Dynamic method dispatch
        Animal a;

        a = new Dog();
        a.sound();  // Output: Dog barks

        a = new Cat();
        a.sound();  // Output: Cat meows

        a = new Cow();
        a.sound();  // Output: Cow moos
    }
}