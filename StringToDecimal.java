import java.util.*;

public class StringToDecimal
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String bin = "";
		for (int i=0; i<str.length(); i++) {
		    if(((int) str.charAt(i)) % 2 != 0) {
		        bin += '1';
		    } 
		    else {
		        bin += '0';
		    }
		}
		System.out.println(Integer.parseInt(bin, 2));
	}
}
