import java.util.*;

public class Flip4thBit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String binary = Integer.toBinaryString(num);
		int digit = binary.length()-4;
		StringBuilder sb = new StringBuilder(binary);
		if(sb.charAt(digit) == 0) {
		    sb.setCharAt(digit, '1');
		}
		else {
		    sb.setCharAt(digit, '0');
		}
		int res = Integer.parseInt(sb.toString(), 2);
        System.out.println(res);
	}
}
