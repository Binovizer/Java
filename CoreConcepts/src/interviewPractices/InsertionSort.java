package interviewPractices;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = new int[]{1,3,5,2,6,4};
		sort(arr);
		for(int i: arr){
			System.out.print(i+" ");
		}
	}

	private static void sort(int[] arr) {
		for(int i = 1;i < arr.length; i++){
			int key = arr[i];
			int j = i-1;
			while(j > 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
}
