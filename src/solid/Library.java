package src.solid;

import src.solid.domain.LibraryItems;

public class Library {
    private LibraryItems[] items;
    public Library(LibraryItems[] items) {
        this.items = items;
    }

    public double totalValueOfRentedLibraryItems(){
        double totalValueOfItems = 0;
        for(LibraryItems item : items){
            totalValueOfItems += item.getValue();
        }
        return totalValueOfItems;
    }
}
