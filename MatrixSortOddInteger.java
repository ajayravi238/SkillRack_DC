import java.util.*;
public class MatrixSortOddInteger {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0; i<row; i++) {
		    for(int j=0; j<col; j++) {
		        arr[i][j] = sc.nextInt();
		    }
		}
		ArrayList<Integer> odd = new ArrayList<>();
		for(int i=0; i<row; i++) {
		    for(int j=0; j<col; j++) {
		        if(arr[i][j]%2 != 0) {
		            odd.add(arr[i][j]);
		        }
		    }
		}
		Collections.sort(odd);
		int k = 0;
		for(int i=0; i<row; i++) {
		    for(int j=0; j<col; j++) {
		        if(arr[i][j]%2 != 0) {
		            arr[i][j] = odd.get(k++);
		        }
		    }
		}
		for(int i=0; i<row; i++) {
		    for(int j=0; j<col; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
