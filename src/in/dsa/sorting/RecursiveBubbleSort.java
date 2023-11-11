package in.dsa.sorting;


public class RecursiveBubbleSort {
	
    public static void bubbleSort(int[] arr, int n, int i){
        
        if(i == n-1) return;


        for(int j = 0; j < n-i-1; j++){

            if(arr[j] > arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }

        bubbleSort(arr, n, i+1);

    }


    public static void bubbleSort(int[] arr, int n) {

        bubbleSort(arr, n, 0);

    }

}