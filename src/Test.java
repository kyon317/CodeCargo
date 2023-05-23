import Sorting.SelectionSort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] testArray = {3,2,1,4,0};
        SelectionSort sortingMachine = new SelectionSort();
        System.out.println(Arrays.toString(sortingMachine.selection_sort(testArray)));
    }
}
