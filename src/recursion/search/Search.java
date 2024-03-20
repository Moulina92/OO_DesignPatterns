package src.recursion.search;

public class Search {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int[] items = {5, 7, 56, 89, 100, 8, 4, 90, 186};
        System.out.println("Finding item index using LinearSearch: " + linearSearch.find(items, 90, 0));
        BinarySearch binarySearch = new BinarySearch();
        int[] itemArray = {5, 7, 8, 34, 56, 68, 74, 90, 186};

        System.out.println("Finding item index using BinarySearch: " +
                binarySearch.find(itemArray, 98, 0, itemArray.length - 1));
    }
}
