package in.dsa.sorting;

public class InsertionSort {

	public static void insertionSorting(int[] arr) {

		int n = arr.length;
		
		for(int i = 1; i < n; i++) {
			
			int temp = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = temp;
			
		}
		
	}


	public static void main(String[] args) {

		//int[] arr = {8,6,1,7};
		int[] arr = {10,-1,0,10,58,1,15};
		insertionSorting(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
