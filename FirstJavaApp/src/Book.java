
public class Book implements Purchasable {
    private String title;
    private String author;
    private int physicalCopies;
    private boolean ebookAvailable;
    private boolean purchasedEBook;

    public Book(String title, String author, int physicalCopies, boolean ebookAvailable) {
        this.title = title;
        this.author = author;
        this.physicalCopies = physicalCopies;
        this.ebookAvailable = ebookAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPhysicalCopies() {
        return physicalCopies;
    }

    public boolean isEbookAvailable() {
        return ebookAvailable;
    }

    public void decreasePhysicalCopies() {
        if (physicalCopies > 0) {
            physicalCopies--;
        }
    }
    
    @Override
    public void purchase() {
        if (ebookAvailable) {
            purchasedEBook = true;
        }
    }
    
    @Override
    public boolean isPurchased() {
        return purchasedEBook;
    }
}