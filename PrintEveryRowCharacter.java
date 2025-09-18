import java.util.*;

public class PrintEveryRowCharacter
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		char[][] arr = new char[row][col];
		for(int i=0; i<row; i++) {
		    for(int j=0; j<col; j++) {
		        arr[i][j] = sc.next().charAt(0);
		    }
		}
		for(int i=0; i<row; i++) {
		    for(int j=0; j<col; j++) {
		        if((j+1)%(i+1) == 0) {
		            System.out.print(arr[i][j] + " ");
		        }
		    }
		}
	}
}
