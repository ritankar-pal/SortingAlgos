package in.dsa.sorting;

public class MergeSort {

	
	private static void mergeSortedArray(int[] arr, int left, int mid, int right) {
		
		int[] temp = new int[right+1];
		int l = left; 
		int r = mid+1;
		
		int i = 0;
		
		while(l <= mid && r <= right) {
			if(arr[l] < arr[r]) {
				temp[i] = arr[l];
				l++;
				i++;
			}
			else {
				temp[i] = arr[r];
				i++;
				r++;
			}
		}
		
		while(l <= mid) {
			temp[i] = arr[l];
			l++;
			i++;
		}
		
		while(r <= right) {
			temp[i] = arr[r];
			i++;
			r++;
		}
		
		//copying the elements from the temp arr to the arr::
		for(int j = left; j <= right; j++) {
			arr[j] = temp[j-left];
		}
		
	}
	
	
	public static void mergeSorting(int[] arr, int left, int right) {
		
		if(left >=  right) {
			return;
		}
		
		int mid = (left + right)/2;
		
		mergeSorting(arr, left, mid);
		mergeSorting(arr, mid+1, right);
		mergeSortedArray(arr, left, mid, right);
		
	}

	public static void main(String[] args) {

		//int[] arr = {8,6,1,7};
		int[] arr = {10,-1,0,10,58,1,15};
		mergeSorting(arr, 0, arr.length-1);

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
