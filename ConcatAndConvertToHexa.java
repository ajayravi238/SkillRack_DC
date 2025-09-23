import java.util.*;

public class ConcatAndConvertToHexa
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		String str = "";
		for(int i=0; i<n; i++) {
		    arr[i] = sc.nextInt();
		    str += Integer.toBinaryString(arr[i]);
		}
		long dec = Long.parseLong(str, 2);
		System.out.println(Long.toHexString(dec).toUpperCase());
	}
}
