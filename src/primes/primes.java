package primes;

public class primes {

	
	public static void main(String[] args) {
		printPrimes(Integer.parseInt(args[0]));

	}
	
	private static void printPrimes(int limit){
		printPrimes(2, limit, 0);
		System.out.println();
	}
	
	private static void printPrimes(int lo, int hi, int m) {
		if(lo <= hi) {
			if (!isPrime(lo)){
				printPrimes(lo+1, hi, m);
			}
			else {
				if (m == 0)
					System.out.println();
				System.out.print(lo + " ");
				printPrimes(lo+1, hi, (m+1) % 10);
			}
		}
	}
	
	private static boolean isPrime(int x) {
		if (x <= 1)
			return false;
		else
			return !isDivisible(x, 2);
	}
	
	private static boolean isDivisible(int x, int k) {
		if (k >= x)
			return false;
		else if (x % k == 0)
			return true;
		else
			return isDivisible(x, k+1);
	}

}
