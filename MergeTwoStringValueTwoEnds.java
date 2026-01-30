import java.util.*;
public class MergeTwoStringValueTwoEnds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		String S2 = sc.next();
		String S3 = "", first = "";
		StringBuilder last = new StringBuilder();
		int minSize = Math.min(S1.length(), S2.length());
		for(int i=0; i<minSize; i++) {
			if(S1.charAt(i) <= S2.charAt(i)) {
				first += S1.charAt(i);
			}
			else if(S2.charAt(i) < S1.charAt(i)) {
				first += S2.charAt(i);
			}
			if(S1.charAt(i) >= S2.charAt(i)) {
				last.append(S1.charAt(i));
			}
			else {
				last.append(S2.charAt(i));
			}
		}
		if(S1.length() > S2.length()) {
			first += S1.substring(minSize);
		} else {
			first += S2.substring(minSize);
		}
		System.out.println(first + last.reverse().toString());
	}
}
