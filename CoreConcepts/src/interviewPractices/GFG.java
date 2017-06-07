package interviewPractices;

import java.util.Scanner;

public class GFG {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0){
			int n = scan.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = scan.nextInt();
			}
			int index = 0;
			int lindex = 0;
			int max_count = -1;
			for(int i = 0; i < n;){
				if(arr[i] == 0){
					int j = i+1;
					int count = 1;
					while(j < n && arr[j] == 0){
						j++;
						count++;
					}
					lindex = j-1;
					if(j == n){
						System.out.println("Inside j==n");
						if(max_count % 2 != 0){
							max_count += 1;
						}
						if(count > max_count / 2){
							System.out.println("Inside count > max_count / 2");
							index = i;
							max_count = count;
						}else{
							max_count -= 1;
							lindex = -1;
						}
					}else{
						if(count > max_count){
							System.out.println("Inside count > max_count");
							index = i;
							max_count = count;
						}
					}
					i = j;
				}else{
					i++;
				}
			}
			if(index == 0){
				System.out.println("first index "+max_count);   
			}else{
				if(lindex == n-1){
					System.out.println("lindex "+ (max_count-1));	
				}else{
					if(max_count % 2 != 0){
						max_count += 1;
					}
					System.out.println("middle "+max_count/2);
				}
			}
		}
		scan.close();
	}
}