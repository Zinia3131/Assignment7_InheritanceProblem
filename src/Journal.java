public class Journal extends LibraryItem {
    private int volumeNumber;
    private String publicationDate;

    public Journal(String title, String author, int itemID, int volumeNumber, String publicationDate) {
        super(title, author, itemID);
        this.volumeNumber = volumeNumber;
        this.publicationDate = publicationDate;
    }

    // Overriding the display method to include journal-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Volume Number: " + volumeNumber);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println();
    }
}
