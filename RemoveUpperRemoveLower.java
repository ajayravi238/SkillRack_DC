import java.util.*;

public class RemoveUpperRemoveLower
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = "";
		int index = -1;
		for(int i=0; i<str.length(); i++) {
		    if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
		        res += str.charAt(i);
		        index = i;
		    }
		    else if(i != 0 && str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' && index != -1) {
		        res += str.charAt(index);
		    }
		}
		if(res.length() == 0 && index == -1) {
		    System.out.println(-1);
		}
		else {
		    System.out.println(res);
		}
	}
}
