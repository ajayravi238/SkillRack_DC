import java.util.*;
public class BinarySubmatrixToInteger {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int[][] arr = new int[R][C];
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        arr[i][j] = sc.nextInt();
		    }
		}
		int K = sc.nextInt();
		for(int x=0; x<R; x+=K) {
		    for(int y=0; y<C; y+=K) {
		        String str = "";
		        for(int i=x; i<x+K; i++) {
		            for(int j=y; j<y+K; j++) {
		              str += arr[i][j];
		            }
		        }
		        int a = Integer.parseInt(str, 2);
		        System.out.print(a + " ");
		    }
		    System.out.println();
		}
	}
}
