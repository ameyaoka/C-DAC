public class Book {
    // Fields
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;

    // Constructors
    public Book(String title, String author, String publisher, String isbn, int year, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Business Logic methods
    // Increase quantity
    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }

    // Decrease quantity
    public void decreaseQuantity(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Error: Insufficient quantity in inventory.");
        }
    }

    // Calculate inventory value
    public double getInventoryValue() {
        return price * quantity;
    }
}


public class Book_Management {
    public static void main(String[] args) {
        // Creating a Book instance
        Book book = new Book("Java Programming", "John Doe", "XYZ Publishers", "1234567890", 2023, 29.99, 50);

        // Increase quantity
        book.increaseQuantity(10);

        // Decrease quantity
        book.decreaseQuantity(20);

        // Calculate inventory value
        double inventoryValue = book.getInventoryValue();
        System.out.println("Inventory Value: $" + inventoryValue);
    }
}

