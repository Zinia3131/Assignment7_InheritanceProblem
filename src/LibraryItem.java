import java.util.ArrayList;

// Superclass: LibraryItem
class LibraryItem {
    private String title;
    private String author;
    private int itemID;

    public LibraryItem(String title, String author, int itemID) {
        this.title = title;
        this.author = author;
        this.itemID = itemID;
    }

    // Method to display common details
    public void displayDetails() {
        System.out.println("Item ID: " + itemID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public int getItemID() {
        return itemID;
    }
}

