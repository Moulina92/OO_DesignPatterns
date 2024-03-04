package src.solid.domain;

public class CD implements LibraryItems {

    private String title;
    private long uniqueIdentifier;
    private double value;
    private String artist;

    public CD(String title, long uniqueIdentifier, double value, String artist) {
        this.title = title;
        this.uniqueIdentifier = uniqueIdentifier;
        this.value = value;
        this.artist = artist;
    }

    @Override
    public double calculateLateFee(int days) {
        return days * 20.0;
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
    public double getValue() {
        return this.value;
    }

    public String getArtist(){
        return this.artist;
    }
}
