import java.util.*;
public class SeriesUsingSumOfDigit {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[K];
		arr[0] = N;
		for(int i=1; i<K; i++) {
		    int sum = arr[i-1];
		    int prev = arr[i-1];
		    while(prev != 0) {
		        int rem = prev % 10;
		        sum += rem;
		        prev /= 10;
		    }
		    arr[i] = sum;
		}
		System.out.print(arr[0] + " ");
		for(int i=1; i<K; i++) {
		    System.out.print(arr[i] + " ");
		}
	}
}
