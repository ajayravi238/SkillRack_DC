import java.util.*;
public class SortMatrixAndPrintPositions {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int[][] arr = new int[R][C];
		int[] sortArr = new int[R*C];
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        arr[i][j] = sc.nextInt();
		    }
		}
		int k=0;
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        sortArr[k++] = arr[i][j];
		    }
		}
		Arrays.sort(sortArr);
		int m = 0;
		int[][] resArr = new int[R][C];
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        resArr[i][j] = sortArr[m++];
		    }
		}
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        for(int a=0; a<R; a++) {
		            for(int b=0; b<C; b++) {
		                if(resArr[i][j] == arr[a][b]) {
		                    System.out.print((a+1) + "-" + (b+1) + " ");
		                }
		            }
		        }
		    }
		    System.out.println();
		}
	}
}
