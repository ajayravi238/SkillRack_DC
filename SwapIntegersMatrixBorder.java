import java.util.*;
public class SwapIntegersMatrixBorder {

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
		int X = sc.nextInt();
		int Y = sc.nextInt();
		List<Integer> border = new ArrayList<>();
		for(int j=0; j<C; j++) {
		    border.add(arr[0][j]);
		}
		for(int i=1; i<R; i++) {
		    border.add(arr[i][C-1]);
		}
		for(int j=C-2; j>=0; j--) {
		    border.add(arr[R-1][j]);
		}
		for(int i=R-2; i>0; i--) {
		    border.add(arr[i][0]);
		}
		int dx = 0, dy = 0;
		int borderSize = border.size();
		dx = (X-1)%borderSize;
		dy = (Y-1)%borderSize;
		int temp = border.get(dx);
		border.set(dx, border.get(dy));
		border.set(dy, temp);
		int k=0;
		for(int j=0; j<C; j++) {
		    arr[0][j] = border.get(k++);
		}
		for(int i=1; i<R; i++) {
		    arr[i][C-1] = border.get(k++);
		}
		for(int j=C-2; j>=0; j--) {
		    arr[R-1][j] = border.get(k++);
		}
		for(int i=R-2; i>0; i--) {
		    arr[i][0] = border.get(k++);
		}
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
