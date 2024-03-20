package src.recursion.selection;

import java.util.Random;

public class QuickSelect {
    private int[] nums;
    private Random random = new Random();

    public QuickSelect(int[] nums) {
        this.nums = nums;
    }

    public int select(int placeOfElementToFind) {
        return quickSelectProcessing(0, nums.length - 1, placeOfElementToFind - 1);
    }

    private int quickSelectProcessing(int firstIndex, int lastIndex, int k) {

        int pivot = partition(firstIndex, lastIndex);
        if (pivot < k) {
            return quickSelectProcessing(pivot + 1, lastIndex, k);
        } else if (pivot > k) {
            return quickSelectProcessing(firstIndex, pivot - 1, k);
        }
        return nums[pivot];
    }

    private int partition(int firstIndex, int lastIndex) {
        int pivot = random.nextInt(lastIndex - firstIndex + 1) + firstIndex;
        swapElements(pivot, lastIndex);
        for (int i = firstIndex; i < lastIndex; ++i) {
            if (nums[i] < nums[lastIndex]) {
                swapElements(i, firstIndex);
                firstIndex++;
            }
        }
        swapElements(lastIndex, firstIndex);
        return firstIndex;
    }

    private void swapElements(int firstElement, int secondElement) {
        int temp = nums[firstElement];
        nums[firstElement] = nums[secondElement];
        nums[secondElement] = temp;
    }
}
