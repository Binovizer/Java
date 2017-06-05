package interviewPractices;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int n){
		if(n < 2 || n % 2 == 0){
			return (n==2);
		}
		for(int i = 3 ; i*i <= n ; i=i+2){
			if(n % i == 0 ){
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimesFromTo(int from, int to){
		for(int i=from; i <= to;i++){
			if(isPrime(i)){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scan.nextInt();
		if(isPrime(n)){
			System.out.println("Prime Number");
		}else{
			System.out.println("Not a prime Number");
		}
		
		System.out.println("Enter from: ");
		int from = scan.nextInt();
		System.out.println("Enter to: ");
		int to = scan.nextInt();
		printPrimesFromTo(from, to);
		
		scan.close();

	}

}
