import java.util.*;
public class AlternateCharacterMatching {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s1Odd = "", s2Odd = "", s1Even = "", s2Even = "";
		for(int i=0; i<s1.length(); i++) {
		    if(i%2 != 0) {
		        s1Even += s1.charAt(i);
		        s2Even += s2.charAt(i);
		    }
		    else {
		        s1Odd += s1.charAt(i);
		        s2Odd += s2.charAt(i);
		    }
		}
		if(s1Odd.equalsIgnoreCase(s2Even) || s1Even.equalsIgnoreCase(s2Odd)) {
		    System.out.println("YES");
		}
		else {
		    System.out.println("NO");
		}
	}
}
