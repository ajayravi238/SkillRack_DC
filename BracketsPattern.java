import java.util.*;
public class BracketsPattern {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split("[\\{\\}\\(\\)\\[\\]\\<\\>]");
		int num = 0;
		for(int i=0; i<arr.length; i++) {
		    if(arr[i] != "") {
		        num = Integer.parseInt(arr[i]);
		    }
		}
		char openBrac = str.charAt(0);
		char closeBrac = str.charAt(str.length()-1);
		for(int i=0; i<num; i++) {
		    for(int j=i; j>=0; j--) {
		        for(int k=j; k>=0; k--) {
		        System.out.print(openBrac);
		        }
		        for(int k=j; k>=0; k--) {
		            System.out.print(closeBrac);
		        }
		    }
		    System.out.println();
		}
	}
}
