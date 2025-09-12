import java.util.*;
public class MatrixCharacterBetweenParantheses {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		char[][] arr = new char[R][C];
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        arr[i][j] = sc.next().charAt(0);
		    }
		}
		char[] resArr = new char[R*C];
		int k=0;
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        resArr[k++] = arr[i][j];
		    }
		}
		int si = 0, ei = 0;
		for(int i=0; i<R*C; i++) {
		    if(resArr[i] == '(') {
		        si = i;
		    }
		    if(resArr[i] == ')') {
		        ei = i;
		    }
		}
		String res = "";
		if(si < ei) {
		    for(int i=si+1; i<ei; i++) {
		        res += resArr[i];
		    }
		}
		else {
		    for(int i=si+1; i<R*C; i++) {
		        res += resArr[i];
		    }
		    for(int i=0; i<ei; i++) {
		        res += resArr[i];
		    }
		}
		System.out.println(res);
	}
}
