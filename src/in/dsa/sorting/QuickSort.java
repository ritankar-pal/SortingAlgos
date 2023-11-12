package in.dsa.sorting;


public class QuickSort {

	public static int partitionFunction(int[] input, int start, int end){

		int pivotElement = input[start];

		//finding the right position of the pivot element:: 
		int count = 0;  

		for(int i = start+1; i <= end; i++){
			if(input[i] < pivotElement) count++;
		}

		//swapping the pivotElement with the Element at the correct pistion:: 
		int temp = input[start+count];
		input[start+count] = input[start];
		input[start] = temp;

		//manipulating the array such that the elements to the left of pivot are all smaller and right are larger::
		int i = start; 
		int j = end; 

		while(i < j){
			if(input[i] < pivotElement){
				i++;
			}
			else if(input[j] >= pivotElement){
				j--; 
			}
			else{
				//swap::
				temp = input[j]; 
				input[j] = input[i];
				input[i] = temp;
				i++;
				j--;
			}
		}

		return start+count;
		
	}
	
	public static void quickSort(int[] input,int startIndex,int endIndex) {
		//Write Your Code Here
		
		if(startIndex >= endIndex){
			return;
		}

		int index = partitionFunction(input, startIndex, endIndex);

		quickSort(input, startIndex, index-1);
		quickSort(input, index+1, endIndex);

	}
	
}
