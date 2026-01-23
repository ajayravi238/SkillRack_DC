import java.util.*;

public class ReplaceWithNextDigit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		String[] arr = new String[N.length()];
		int[] res = new int[N.length()];
		for(int i=0; i<N.length(); i++) {
		    int a = 0;
		    if(N.charAt(i) == '9') {
		        a = 0;
		    }
		    else {
		        a = Character.getNumericValue(N.charAt(i)) + 1;
		    }
		    arr[i] = N.substring(0, i) + a + N.substring(i+1);
		    res[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(res);
		System.out.println(Arrays.toString(res));
	}
}
