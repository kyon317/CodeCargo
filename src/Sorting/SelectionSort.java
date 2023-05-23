package Sorting;

public class SelectionSort {
    public int[] selection_sort(int[] arr){
        if (arr==null || arr.length < 2){
            return arr;
        }
        for (int i = 0; i< arr.length - 1; i ++){
            int minIndex = i;
            for (int j = i; j < arr.length; j++){
                    minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i , minIndex);
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
