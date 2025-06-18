import java.util.*;
public class IntegerFlipKthDigit {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		int K = sc.nextInt();
		int sum = 0;
		for(int i=0; i<N; i++) {
		    String bin = Integer.toBinaryString(arr[i]);
		    StringBuilder sb = new StringBuilder(bin);
		    if(bin.length() >= K) {
		        if(sb.charAt(sb.length()-K) == '0') {
		            sb.setCharAt(sb.length()-K, '1');
		        }
		        else {
		            sb.setCharAt(sb.length()-K, '0');
		        }
		    }
		    String a = String.valueOf(sb);
		    sum += Integer.parseInt(a, 2);
		}
	    System.out.println(sum);
	}
}
