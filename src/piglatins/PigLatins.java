package piglatins;

public class PigLatins {

	/** Translation of W (a single word) into Pig Latin. */
	static String toPig (String w) {
		return w.substring(consonants(w)) + w.substring(0, consonants(w)) + "ay";
	}
	
	/** The number of consonants at the beginning of W (a single word). */
	static int consonants (String w) {
		return consonants (w, 0);		
	}
	
	/** The number of consonants at the beginning of the substring of W 
	 * that stats at position K. */
	static int consonants (String w, int k) {
		if(w.length() <= k)
			return 0;
		else if (isVowel(w.charAt(k)))
			return 0;
		else
			return 1 + consonants(w, k+1);
	}
	
	static boolean isVowel (char x) {
		return ("aeiou").indexOf(x) >= 0;
	}
	
	public static void main(String[] args) {
		translate(args, 0);
		System.out.println();
	}
	
	/** Print the translations of SENT[K], SENT[K+1], ..., all on one line */
	static void translate(String[] sent, int k) {
		if (k < sent.length) {
			System.out.print(toPig(sent[k]) + " ");
			translate(sent, k+1);
		}
	}

}
