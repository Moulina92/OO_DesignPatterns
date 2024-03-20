package src.recursion.search;

public class LinearSearch {
    public int find(int[] container, int item, int index) {

        if (index >= container.length) return -1;
        if (container[index] == item) return index;

        return find(container, item, index + 1);
    }
}
