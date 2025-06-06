import java.util.*;

public class ThirdBitFromLast
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String binary = Integer.toBinaryString(num);
		System.out.println(binary.charAt(binary.length()-3));
	}
}
