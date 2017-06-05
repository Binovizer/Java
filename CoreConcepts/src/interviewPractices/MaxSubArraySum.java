package interviewPractices;

public class MaxSubArraySum {

	public static int maxSubArraySum(int arr[]){
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;
		for(int i = 0;i < arr.length; i++){
			max_ending_here += arr[i];
			if(max_so_far < max_ending_here){
				max_so_far = max_ending_here;
			}
			if(max_ending_here < 0){
				max_ending_here = 0;
			}
		}
		return max_so_far;
	}
	
	public static void main(String[] args) {
		int arr[]  = new int[]{1, 2, -5, 6, 7, -4, 5, 6};
		System.out.println("Max SubArraySum Is : "+maxSubArraySum(arr));
		
	}
	
}
