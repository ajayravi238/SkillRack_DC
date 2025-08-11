import java.util.*;
public class FindTheBallThreeCups {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = sc.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];
		for(int i=0; i<N; i++) {
		    X[i] = sc.nextInt();
		    Y[i] = sc.nextInt();
		}
		int bp = P;
		for(int i=0; i<N; i++) {
		if(X[i] == bp) {
		    bp = Y[i];
		}
		else if(Y[i] == bp) {
		    bp = X[i];
		}
		}
		System.out.println(bp);
	}
}
