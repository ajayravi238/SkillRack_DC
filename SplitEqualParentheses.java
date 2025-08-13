import java.util.*;
public class SplitEqualParentheses {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int openCount=0, closeCount=0, start = 0, end = 0;
		for(int i=0; i<str.length(); i++) {
		    if(str.charAt(i) == '(') {
		        openCount++;
		    }
		    else if(str.charAt(i) == ')') {
		        closeCount++;
		    }
		    if(openCount == closeCount) {
		        end = i;
		        System.out.println(str.substring(start, end+1));
		        start = end+1;
		    }
		}
	}
}
