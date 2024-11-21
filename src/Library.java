import java.util.ArrayList;
public class Library {
    public ArrayList<LibraryItem> collection;

    public Library() {
        collection = new ArrayList<>();
    }

    // Add an item to the library
    public void addItem(LibraryItem item) {
        collection.add(item);
        System.out.println("Item added: " + item.getClass().getSimpleName());
    }

    // Remove an item from the library
    public void removeItem(int itemID) {
        LibraryItem toRemove = null;
        for (LibraryItem item : collection) {
            if (item.getItemID() == itemID) {
                toRemove = item;
                break;
            }
        }

        if (toRemove != null) {
            collection.remove(toRemove);
            System.out.println("Item removed: " + toRemove.getClass().getSimpleName());
        } else {
            System.out.println("Item with ID " + itemID + " not found.");
        }
    }
    public void displayAllItems() {
        System.out.println("\nLibrary Collection:");
        for (LibraryItem item : collection) {
            item.displayDetails();
        }
    }
}
