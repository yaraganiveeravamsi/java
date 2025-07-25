class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    String add(String a, String b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Integer addition
        int sum1 = calc.add(5, 10);
        System.out.println("Sum of integers: " + sum1);

        // Double addition
        double sum2 = calc.add(3.5, 4.5);
        System.out.println("Sum of doubles: " + sum2);

        // String addition (concatenation)
        String sum3 = calc.add("Good ", "Morning");
        System.out.println("Sum of strings: " + sum3);
    }
}