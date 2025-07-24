abstract class Shape {
    // Abstract method
    abstract double area();
}

// Circle class inherits Shape
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Override area method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class inherits Shape
class Rectangle extends Shape {
    double length, width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override area method
    @Override
    double area() {
        return length * width;
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(6, 8);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}