package src.solid;

import src.solid.domain.Book;
import src.solid.domain.CD;
import src.solid.domain.LibraryItems;

public class LibraryApplication {

    public static void main(String[] args) {
        LibraryItems[] arrayOfItems = {new Book("ABC", 1, 10.0, "Au"),
                new CD("CD", 1, 20.0, "art")};

        Library library = new Library(arrayOfItems);
        LateFeeCalculator lateFeeCalculator = new LateFeeCalculator();

        System.out.println(library.totalValueOfRentedLibraryItems() + lateFeeCalculator.totalLateFeeCalculator(arrayOfItems, 2));
    }
}
