package interviewPractices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PowerfulNumbers {
	
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
	
	public static List<Integer> getPrimeNumbers(int from, int to){
		List<Integer> primes = new ArrayList<>();
		for(int i=from; i<=to;i++){
			if(isPrime(i)){
				primes.add(i);
			}
		}
		return primes;
	}
	
	public static List<Integer> getPowerful(int from, int to){
		List<Integer> powerfuls = new ArrayList<>();
		for(int i = from; i <= to; i++){
			if(isPowerful(i)){
				powerfuls.add(i);
			}
		}
		return powerfuls;
	}
	
	public static boolean isPowerful(int n){
		int temp = n;
		Set<Integer> factors = new TreeSet<>();
		List<Integer> primes = getPrimeNumbers(2, n/2);
		//System.out.println("Primes are: "+primes);
		if(n == 1){
			return true;
		}
		
		while(! isPrime(n)){
			for(Integer i : primes){
				if(n % i == 0){
					factors.add(i);
					n = n / i;
					break;
				}
			}
		}
		factors.add(n);
		//System.out.println("Factors are: "+factors);
		
		for(Integer i: factors){
			if(temp % (i*i) != 0){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		if(isPowerful(n)){
			System.out.println("Powerful");
		}else{
			System.out.println("Not Powerful");
		}
		
		System.out.println("Enter from: ");
		int from = scan.nextInt();
		System.out.println("Enter to: ");
		int to = scan.nextInt();
		System.out.println("Powerfuls are: "+getPowerful(from, to));
		scan.close();
	}

}
