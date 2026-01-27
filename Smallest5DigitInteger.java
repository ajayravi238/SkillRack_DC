import java.util.*;
public class Smallest5DigitInteger {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int flag = 0;
		for(long i=10000; i<=99999; i++) {
		    int sum = 0;
		    String str = String.valueOf(i);
		    for(int j=0; j<str.length(); j++) {
		        sum += Character.getNumericValue(str.charAt(j));
		    }
		    if(sum == N) {
		        System.out.println(i);
		        flag = 1;
		        break;
		    }
		}
		if(flag == 0) {
		    System.out.println(-1);
		}
	}
}
