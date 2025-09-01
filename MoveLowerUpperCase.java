import java.util.*;

public class MoveLowerUpperCase
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String lower = "", upper = "", num = "";
		for(int i=0; i<str.length(); i++) {
		    if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
		        lower += str.charAt(i);
		    }
		    else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
		        num += str.charAt(i);
		    }
		    else {
		        upper += str.charAt(i);
		    }
		}
		System.out.println(lower + "" + num + "" + upper);
	}
}
