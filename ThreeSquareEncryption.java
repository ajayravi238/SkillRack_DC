import java.util.*;
public class ThreeSquareEncryption {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.nextLine();
		String S2 = sc.nextLine();
		char[][] arr1 = new char[3][3];
		char[][] arr2 = new char[3][3];
		char[][] arr3 = new char[3][3];
		int z = 0;
		for(int i=0; i<3; i++) {
		    for(int j=0; j<3; j++) {
		        arr1[i][j] = S2.charAt(z++);
		    }
		}
		for(int i=0; i<3; i++) {
		    for(int j=0; j<3; j++) {
		        arr2[i][j] = S2.charAt(z++);
		    }
		}
		for(int i=0; i<3; i++) {
		    for(int j=0; j<3; j++) {
		        arr3[i][j] = S2.charAt(z++);
		    }
		}
		for(int i=0; i<S1.length(); i++) {
		    for(int j=0; j<3; j++) {
		        for(int k=0; k<3; k++) {
		            if(S1.charAt(i) == arr1[j][k]) {
		                System.out.print(1 + "" + (j+1) + "" + (k+1));
		            }
		        }
		    }
		    for(int j=0; j<3; j++) {
		        for(int k=0; k<3; k++) {
		            if(S1.charAt(i) == arr2[j][k]) {
		                System.out.print(2 + "" + (j+1) + "" + (k+1));
		            }
		        }
		    }
		    for(int j=0; j<3; j++) {
		        for(int k=0; k<3; k++) {
		            if(S1.charAt(i) == arr3[j][k]) {
		                System.out.print(3 + "" + (j+1) + "" + (k+1));
		            }
		        }
		    }
		}
	}
}
