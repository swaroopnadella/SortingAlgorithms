public class BubbleSortAlgo {
	
	public void printArray(int arr[]) {
		
		int n = arr.length;
		for(int i=0;i<n-1;i++)
			System.out.print(arr[i]+" ");
	}
	
	// Sorts using the comparison between two consecutive values, by iterating through entire array
	public void bubbleSort(int arr[]) {
		
		int n = arr.length;
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++)
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
	}

	public static void main(String[] args) {
		
		BubbleSortAlgo bs = new BubbleSortAlgo();
		
		int arr[] = {32,24,11,87,65,90,324,765};
		System.out.println("Original Array");
		bs.printArray(arr);
		bs.bubbleSort(arr);
		System.out.println("\nSorted Array");
		bs.printArray(arr);
		
	}

}