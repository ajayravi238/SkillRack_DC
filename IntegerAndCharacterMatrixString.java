import java.util.*;
public class IntegerAndCharacterMatrixString {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // 1045a20s80df
		int N = sc.nextInt(); // 2
		String ch = ""; // asdf
		String num = ""; // 10452080
		for(int i=0; i<str.length(); i++) {
		    if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
		        ch += str.charAt(i);
		    }
		    else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
		        num += str.charAt(i);
		    }
		}
		int chSize = ch.length() / (N*N); // 1 
		int numSize = num.length() / (N*N); // 2
		String[][] chRes = new String[N][N];
		String[][] numRes = new String[N][N];
        int l=0, m=0;
		    for(int j=0; j<N; j++) {
		        for(int k=0; k<N; k++) {
		            numRes[j][k] = num.substring(l, l+numSize);
		            chRes[j][k] = ch.substring(m, m+chSize);
		            l+=numSize;
		            m+=chSize;
		    }
		}
		
		for(int i=0; i<N; i++) {
		    for(int j=0; j<N; j++) {
		        System.out.print(numRes[i][j] + " ");
		    }
		    System.out.println();
		}
		for(int i=0; i<N; i++) {
		    for(int j=0; j<N; j++) {
		        System.out.print(chRes[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
