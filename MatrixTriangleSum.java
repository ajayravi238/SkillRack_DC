import java.util.*;
public class MatrixTriangleSum {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		for(int i=0; i<N; i++) {
		    for(int j=0; j<N; j++) {
		        arr[i][j] = sc.nextInt();
		    }
		}
		int lSum = 0, rSum = 0;
		int k = N, l = N-1;
		for(int i=0; i<N; i++) {
		    for(int j=0; j<k; j++) {
		        lSum += arr[i][j];
		    }
		    k--;
		    for(int j=l; j<N; j++) {
		        rSum += arr[i][j];
		    }
		    l--;
		    System.out.println();
		}
		System.out.println(lSum);
		System.out.println(rSum);
	}
}
