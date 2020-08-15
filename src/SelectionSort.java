
public class SelectionSort {
	
	public void printArray(int arr[]) {
		
		int n = arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	
	//Iterates through the entire array
	//minimum index is identified and using an inner loop, the lowest element is found and swapped to current position
	public void selectionSortAlgo(int arr[]) {
		
		int n = arr.length;
		System.out.println("\n\nLength of array: "+n);
		int min_index = 0;
		for(int i=0;i<n;i++) {
			min_index=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
	}
	
	
	public static void main(String[] args) {
		
		SelectionSort sSort = new SelectionSort();
		
		int arr[] = {32,24,49,11,87,65,90,324,765,42,77,2};
		System.out.println("Original Array");
		sSort.printArray(arr);
		sSort.selectionSortAlgo(arr);
		System.out.println("\nSorted Array using Selection Sort");
		sSort.printArray(arr);
		
	}

}
