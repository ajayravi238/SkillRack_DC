import java.util.*;
public class TotalSecondTypeKeyboard {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		String K = sc.next();
		int sum = 0;
		for(int i=0; i<K.length()-1; i++) {
		    int si = 0, ei = 0;
		    for(int j=0; j<S.length; j++) {
		        if(K.charAt(i) == S[j]) {
		            si = j;
		        }
		        if(K.charAt(i+1) == S[j]) {
		            ei = j;
		        }
		    }
		    sum += Math.abs(si - ei);
		}
		System.out.println(sum);
	}
}
