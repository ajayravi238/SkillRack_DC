import java.util.*;
public class MultiplicativePresitance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = String.valueOf(N);
		int mul = 1;
		int a = 0, c = 0;
		String b = "";
		a = multi(str, mul);
		c++;
		while(a > 10) {
			b = String.valueOf(a);
			mul = 1;
			a = multi(b, mul);
			c++;
		}
		System.out.println(c);
	}

	public static int multi(String str, int mul) {
		for(int i=0; i<str.length(); i++) {
			mul *= Character.getNumericValue(str.charAt(i));
		}
		return mul;
	}
}
