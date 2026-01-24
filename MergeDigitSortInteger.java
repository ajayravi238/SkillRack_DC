import java.util.*;
public class MergeDigitSortInteger {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.next();
		}
		String[] res = new String[N/2];
		int x = 0;
		for(int i=0; i<N-1; i+=2) {
		    String str = "";
		    for(int j=0; j<arr[i].length(); j++) {
		        if(Character.getNumericValue(arr[i].charAt(j)) > Character.getNumericValue(arr[i+1].charAt(j))) {
		            str += arr[i].charAt(j);
		            str += arr[i+1].charAt(j);
		        }
		        else {
		            str += arr[i+1].charAt(j);
		            str += arr[i].charAt(j);
		        }
		    }
		    res[x++] = str;
		}
		Arrays.sort(res);
		for(int y=0; y<res.length; y++) {
		    System.out.print(res[y] + " ");
	    }
	}
}
