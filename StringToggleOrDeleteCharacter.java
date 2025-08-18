import java.util.*;
public class StringToggleOrDeleteCharacter {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String binStr = sc.nextLine();
		String res = "";
		for(int i=0; i<str.length(); i++) {
		    if(binStr.charAt(i) == '1') {
		        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
		            res += Character.toUpperCase(str.charAt(i));
		        }
		        else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
		            res += Character.toLowerCase(str.charAt(i));
		        }
		    }
		    else {
		        res += str.charAt(i);
		    }
		}
		System.out.println(res);
	}
}
