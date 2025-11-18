import java.util.*;
public class RearrangeUnitDigitFindSum {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.next();
		}
		String[] res = new String[N];
		for(int i=0; i<N-1; i++) {
		    String str = "";
		    str += arr[i].substring(1);
		    str += arr[i+1].charAt(0);
		    res[i] = str;
		}
		res[N-1] = arr[N-1].substring(1) + "" + arr[0].charAt(0);
		long sum = 0;
		for(int i=0; i<N; i++) {
		    sum += Integer.parseInt(res[i]);
		}
		System.out.println(sum);
	}
}
