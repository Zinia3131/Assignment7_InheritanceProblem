public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some books and journals
        library.addItem(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1, 180, "Scribner"));
        library.addItem(new Journal("Nature", "Various Authors", 2, 102, "2024-10-15"));
        library.addItem(new Book("To Kill a Mockingbird", "Harper Lee", 3, 324, "J.B. Lippincott & Co."));
        library.addItem(new Journal("Science", "Various Authors", 4, 56, "2024-09-30"));

        // Display all items
        library.displayAllItems();

        // Remove an item
        library.removeItem(3);

        // Display all items after removal
        library.displayAllItems();
    }
}
