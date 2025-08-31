import java.util.*;

public class Abbrivation
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i++) {
		    System.out.print(Character.toUpperCase(arr[i].charAt(0)));
		}

		
	}
}
