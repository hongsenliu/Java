package sortarray;

public class sort {

	/** Sort and print WORDS lexicographically. */
	public static void main(String[] words) {
		sort(words, 0, words.length-1);
		print(words);

	}
	
	/** Sort items A[L...U], with all others unchanged. */
	static void sort (String[] A, int L, int U) {
		if (L < U) {
			int k = indexOfLargest(A, L, U);
			String tmp = A[k]; A[k] = A[U]; A[U] = tmp;
			sort(A, L, U-1);
		}
	}
	
	/** Print A on one line, separated by blanks. */
	static void print (String[] A) {
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
	
	/** Value k, i0<=k<=i1, such that V[k] is largest element among 
	 * V[i0], ..., V[i1]. Requires io<=i1. */
	static int indexOfLargest(String[] V, int i0, int i1) {
		if (i0 >= i1)
			return i1;
		else {
			int k = indexOfLargest(V, i0+1, i1);
			return (V[i0].compareTo(V[k]) > 0) ? i0 : k;
		}
	}
	

}
