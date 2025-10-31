import java.util.*;
public class ExpandAndSortIntegers {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.next();
		}
		Long[] res = new Long[N];
		for(int i=0; i<N; i++) {
		    int max = 0, mi = 0;
		    for(int j=0; j<arr[i].length(); j++) {
		        int a = Character.getNumericValue(arr[i].charAt(j));
		        if(a > max) {
		            max = a;
		            mi = j;
		        }
		    }
		    String str = "";
		    str += arr[i].substring(0, mi);
		    for(int j=0; j<max-1; j++) {
		        str += max;
		    }
		    str += arr[i].substring(mi);
		    res[i] = Long.parseLong(str);
		}
		Arrays.sort(res);
		for(int i=0; i<N; i++) {
		    System.out.print(res[i] + " ");
		}
	}
}
