public class InsertSortAlgo {
	
	public void printArray(int arr[]) {
		
		int n = arr.length;
		for(int i=0;i<n-1;i++)
			System.out.print(arr[i]+" ");
	}
	
	// Current element(key) is compared with previous elements of the array
	// Remaining elements are moved ahead when key is smaller and then key is placed at correct position 
	public void insertionSort(int arr[]) {
		
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1]=key;
		}
	}

	public static void main(String[] args) {
		
		InsertSortAlgo iSort = new InsertSortAlgo();
		
		int arr[] = {32,24,49,11,87,65,90,324,765};
		System.out.println("Original Array");
		iSort.printArray(arr);
		iSort.insertionSort(arr);
		System.out.println("\nSorted Array");
		iSort.printArray(arr);
		
	}

}