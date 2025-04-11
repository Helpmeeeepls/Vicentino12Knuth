public class BookManagementSystem {

    String title;
    String author;
    double price;

    public BookManagementSystem() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public BookManagementSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public BookManagementSystem(BookManagementSystem b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }

    void displayBookManagementSystem() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        BookManagementSystem book1 = new BookManagementSystem();
        BookManagementSystem book2 = new BookManagementSystem("Java Programming", "Enzo", 500.0);
        BookManagementSystem book3 = new BookManagementSystem(book2);

        System.out.println("Default Book:");
        book1.displayBookManagementSystem();

        System.out.println("Parameterized Book:");
        book2.displayBookManagementSystem();

        System.out.println("Copied Book:");
        book3.displayBookManagementSystem();
    }
}
