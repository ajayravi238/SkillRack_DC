import java.util.*;

public class CustomSplitUsingCharacter
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = sc.next().charAt(0);
		String a = String.valueOf(ch);
		String[] arr = str.split(a);
		for(int i=0; i<arr.length; i++) {
		    if(!(arr[i].equals(""))) {
		        System.out.println(arr[i]);
		    }
		}
	}
}
