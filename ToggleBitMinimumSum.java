import java.util.*;
public class ToggleBitMinimumSum {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		String[] binArr = new String[N];
		for(int i=0; i<N; i++) {
		    binArr[i] = Integer.toBinaryString(arr[i]);
		}
		String[] resArr = new String[N];
		for(int i=0; i<N; i++) {
		    if(binArr[i].charAt(0) == '1') {
		        resArr[i] = "0" + "" + binArr[i].substring(1);
		    }
		}
		int s = 0;
		for(int i=0; i<N; i++) {
		    s += Integer.parseInt(resArr[i], 2);
		}
		System.out.println(s);
	}
}
