import java.util.*;

public class ConcatOrAdd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if(s1.contains(".") || s2.contains(".")) {
		   float f = Float.parseFloat(s1) + Float.parseFloat(s2);
		   System.out.printf("%.2f", f);
		}
		else if((s1.charAt(0) >= 'a' && s1.charAt(0) <= 'z') || (s1.charAt(0) >= 'A' && s1.charAt(0) <= 'Z')) {
		    String res = s1 + s2;
		    System.out.println(res);
		}
		else if(s1.charAt(0) >= '1' && s1.charAt(0) <= '9') {
		    int add = Integer.parseInt(s1) + Integer.parseInt(s2);
		    System.out.println(add);
		}
	}
}
