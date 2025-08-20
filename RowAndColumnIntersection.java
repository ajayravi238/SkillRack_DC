import java.util.*;
public class RowAndColumnIntersection {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		for(int i=0; i<N; i++) {
		    for(int j=0; j<N; j++) {
		        arr[i][j] = sc.nextInt();
		    }
		}
		for(int x=0; x<N; x++) {
		    boolean rowZero = true, colOne = true;
		    for(int j=0; j<N; j++) {
		        if(x != j && arr[x][j] != 0) {
		            rowZero = false;
		            break;
		        }
		    }
		    for(int i=0; i<N; i++) {
		        if(x != i && arr[i][x] != 1) {
		            colOne = false;
		            break;
		        }
		    }
		    if(rowZero && colOne) {
		        System.out.println(x+1);
		        return;
		    }
		}
		System.out.println(-1);
	}
}
