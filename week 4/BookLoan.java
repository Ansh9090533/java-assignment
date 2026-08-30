public class BookLoan{
    public static void main(String[] args) {

        Book book1 = new Book("Java Basics", "James Smith", "B101");
        Book book2 = new Book("Data Structures", "John Doe", "B102");

        System.out.println(book1);
        System.out.println("Borrow: " + book1.borrowBook());
        System.out.println("Borrow again: " + book1.borrowBook());
        System.out.println("Available: " + book1.isAvailable());

        System.out.println();

        System.out.println("Return: " + book1.returnBook());
        System.out.println("Available: " + book1.isAvailable());

        System.out.println();

        System.out.println(book2);
        System.out.println("Return without borrowing: " + book2.returnBook());
        System.out.println("Borrow: " + book2.borrowBook());
    }
}
