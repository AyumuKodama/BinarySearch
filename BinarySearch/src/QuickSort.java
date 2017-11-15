
public class QuickSort {
	public static void quickSort(int[] arr, int lo, int hi) {
		if (lo < hi) {
			int pivotIndex = partition(arr, lo, hi);
			quickSort(arr, lo, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, hi);
		}
	}
	
	public static int partition(int[] arr, int lo, int hi) {
		int pivot = lo;
		int start = lo + 1;
		int end = hi;
		int temp = 0;
		
		while (start <= end) {
			while (arr[start] <= arr[pivot]) {
				start++;
			}				
			while (arr[end] > arr[pivot]) {
				end--;
			}
			if (start <= end) {
				temp = arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
			}
		}
		
		temp = arr[end];
		arr[end] = arr[pivot];
		arr[pivot] = temp;

		temp = end;
		end = pivot;
		pivot = temp;
		
		return pivot; 
	}

}
