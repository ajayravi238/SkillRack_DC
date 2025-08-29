import java.util.*;
public class LargestKDigitInteger {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int K = sc.nextInt();
		int max = Integer.MIN_VALUE;
		if(N.length() < K) {
		    System.out.println(-1);
		}
		else {
		for(int i=0; i<=N.length()-K; i++) {
		  int b = Integer.parseInt(N.substring(i, i+K));
		  if(max < b) {
		      max = b;
		  }
		}
		System.out.println(max);
		}
	}
}
