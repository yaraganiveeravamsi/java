class Book {
    // Fields
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println();
    }

    // Main method inside Book class
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("The Cloud Apprentice", "Sowmya Kundeti", 599.0);
        Book book2 = new Book("Mastering DevOps", "Veeravamsi Rao", 749.0);

        // Print their details
        book1.displayDetails();
        book2.displayDetails();
    }
}