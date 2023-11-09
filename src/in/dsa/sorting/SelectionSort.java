package in.dsa.sorting;

public class SelectionSort {

	public static void selectionSorting(int[] arr) {

		int n = arr.length;
		
		for(int i = 0; i < n-1; i++) {
			
			int min = arr[i];
			int index = i;
					
			for(int j = i; j < n; j++) {
				
				if(arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}
			
			//swap::
			int temp = min;
			arr[index] = arr[i];
			arr[i] = temp;
			
		}
		
	}


	public static void main(String[] args) {

		//int[] arr = {8,6,1,7};
		int[] arr = {10,-1,0,10,58,1,15};
		selectionSorting(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
