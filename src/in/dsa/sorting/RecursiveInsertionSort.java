package in.dsa.sorting;

public class RecursiveInsertionSort {
	
    public static void insertionSort(int[] arr, int size, int i){

        if(i == arr.length) return;

        int temp = arr[i];

        int j = i-1; 

        while(j >= 0 && arr[j] > temp){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp;

        insertionSort(arr, size, i+1);

    }


    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        insertionSort(arr, size, 1);

    }
}