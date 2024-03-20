package src.recursion.selection;

public class Selection {
    public static void main(String[] args) {
        int[] nums = {1, -5, 10, 55, 2, 3, -7, 7, 11, 100};
        QuickSelect quickSelect = new QuickSelect(nums);
        System.out.println(quickSelect.select(10));

    }
}
