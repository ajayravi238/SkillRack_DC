import java.util.*;
public class RandomNumberGame {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		int X = sc.nextInt();
		int flag = 0;
		for(int i=0; i<N; i++) {
		    if(arr[i] == X) {
		        X = X+X;
		        flag = 1;
		    }
		}
		if(flag == 0) {
		    X = 0;
		}
		System.out.println(X);
	}
}
