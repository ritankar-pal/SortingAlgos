package in.dsa.sorting;

public class BubbleSort {

	
	public static void bubbleSorting(int[] arr) {
		
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++) {
			
			for(int j = 0; j < n-i-1; j++) {
				
				//swap::
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
//		int[] arr = {8,6,1,7};
		int[] arr = {10,-1,0,10,58,1,15};
		bubbleSorting(arr);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}

}
