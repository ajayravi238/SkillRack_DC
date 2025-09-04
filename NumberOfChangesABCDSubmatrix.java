import java.util.*;
public class NumberOfChangesABCDSubmatrix {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		char[][] arr = new char[n1][n2];
		for(int i=0; i<n1; i++) {
		    for(int j=0; j<n2; j++) {
		        arr[i][j] = sc.next().charAt(0);
		    }
		}
		int c = 0;
		for(int i=0; i<n1-1; i=i+2) {
		    for(int j=0; j<n2-1; j=j+2) {
		        char[] subArr = new char[4];
		        subArr[0] = arr[i][j];
		        subArr[1] = arr[i][j+1];
		        subArr[2] = arr[i+1][j];
		        subArr[3] = arr[i+1][j+1];
		        if(subArr[0] != 'A') {
		            c++;
		        }
		        if(subArr[1] != 'B') {
		            c++;
		        }
		        if(subArr[2] != 'C') {
		            c++;
		        }
		        if(subArr[3] != 'D') {
		            c++;
		        }
		    }
		}
		System.out.println(c);
	}
}
