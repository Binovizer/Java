package interviewPractices;

import java.util.Arrays;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = scan.nextInt();
		}
		System.out.println(getResult(arr));
		scan.close();

	}

	private static int getResult(int[] arr) {
		if(Arrays.toString(arr).indexOf('1') == -1){
			return -1;
		}
		int count = 0;
		while(Arrays.toString(arr).indexOf('0') > 0){
			int tempArr[] = Arrays.copyOf(arr, arr.length);
			for(int i=0;i < arr.length;i++){
				if(i-1 >= 0 && arr[i-1] == 1){
					tempArr[i] = 1;
				}
				if(i+1 < arr.length && arr[i+1] == 1){
					tempArr[i] = 1;
				}
			}
			arr = tempArr;
			count++;
			System.out.println(Arrays.toString(arr));
		}
		return count;
	}

}
