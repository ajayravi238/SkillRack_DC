import java.util.*;
public class TextEditorShiftAndCapsLock {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder res = new StringBuilder();
		String[] arr = str.split(" ");
		boolean shift  = false, caps = false;
		for(int i=0; i<arr.length; i++) {
		    if(arr[i].equals("CAPSLOCK")) {
		        caps = !caps;
		    }
		    else if(arr[i].startsWith("SHIFT+")) {
		        if(caps) {
		            for(int j=6; j<arr[i].length(); j++) {
		                res.append(Character.toLowerCase(arr[i].charAt(j)));
		            }
		        }
		        else {
		            for(int j=6; j<arr[i].length(); j++) {
		                res.append(Character.toUpperCase(arr[i].charAt(j)));
		            }
		        }
		    }
		    else {
		        if(caps) {
		            res.append(arr[i].toUpperCase());
		        }
		        else {
		            res.append(arr[i].toLowerCase());
		        }
		    }
		}
		System.out.println(res.toString());
	}
}
