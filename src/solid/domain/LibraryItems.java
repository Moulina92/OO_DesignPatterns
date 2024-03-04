package src.solid.domain;

/*
 * LibraryItems has only one reason to change -- Single Responsibility
 * We have also segregated the late calculation responsibility to another interface,
 * achieved Interface Segregation.(Slim Interface)
 */
public interface LibraryItems extends LateFeeCalculator {

    String getTitle();

    long getUniqueIdentifier();

    double getValue();
}
