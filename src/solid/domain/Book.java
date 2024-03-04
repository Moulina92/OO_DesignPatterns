package src.solid.domain;

/*
 * Book is open for extension and Library item is closed for modification.
 */
public class Book implements LibraryItems {

    private String title;
    private long uniqueIdentifier;
    private double value;
    private String author;

    public Book(String title, long uniqueIdentifier, double value, String author) {
        this.title = title;
        this.uniqueIdentifier = uniqueIdentifier;
        this.value = value;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public long getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    @Override
    public double calculateLateFee(int days) {
        return days * 10.0;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    public String getAuthor() {
        return this.author;
    }
}
