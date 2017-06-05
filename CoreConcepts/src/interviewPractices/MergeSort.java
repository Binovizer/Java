package interviewPractices;

public class MergeSort {

	public static void merge(int arr[], int p, int q, int r){
		int n1 = q - p + 1;
		int n2 = r - q;
		int left[] = new int[n1];
		int right[] = new int[n2];
		for(int i=0;i<n1;i++){
			left[i] = arr[p+i];
		}
		for(int j=0;j < n2;j++){
			right[j] = arr[q+j+1];
		}
		int i = 0;
		int j = 0;
		int k = p;
		while(i < n1 && j < n2){
			if(left[i] <= right[j]){
				arr[k] = left[i];
				i++;
			}else{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < n1){
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j < n2){
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	
	public static void mergeSort(int arr[], int p, int r){
		if(p < r){
			int q = (p + r) / 2;
			mergeSort(arr, p, q);
			mergeSort(arr, q+1, r);
			merge(arr, p, q, r);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = new int[]{1,3,6,4,5,2};
		int p = 0;
		int r = arr.length-1;
		mergeSort(arr, p, r);
		for(int i: arr){
			System.out.print(i+" ");
		}
	}
}
