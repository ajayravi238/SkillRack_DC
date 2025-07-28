import java.util.*;
public class FindTimeStopWatch {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		int sum = 0;
		if(N%2 != 0) {
		    System.out.println("-1");
		    return;
		}
		else {
		    for(int i=0; i<N-1; i+=2) {
		        sum += (arr[i+1] - arr[i]);
		    }
		}
		System.out.println(sum);
	}
}
