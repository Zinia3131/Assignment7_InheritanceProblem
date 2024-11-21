class Book extends LibraryItem {
    private int numberOfPages;
    private String publisher;

    public Book(String title, String author, int itemID, int numberOfPages, String publisher) {
        super(title, author, itemID);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    // Overriding the display method to include book-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Publisher: " + publisher);
        System.out.println();
    }
}