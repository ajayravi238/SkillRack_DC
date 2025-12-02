import java.util.*;
public class DifferenceSameOrDifferentPosition {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		int[] sortArr = arr.clone();
		Arrays.sort(sortArr);
		int X = 0, Y = 0;
		for(int i=0; i<N; i++) {
		    if(arr[i] == sortArr[i]) {
		        X += arr[i];
		    }
		    else {
		        Y += arr[i];
		    }
		}
		System.out.println(Math.abs(X-Y));
	}
}
