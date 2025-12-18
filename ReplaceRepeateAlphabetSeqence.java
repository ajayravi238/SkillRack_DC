import java.util.*;
public class ReplaceRepeateAlphabetSeqence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = "";
		for(int i=0; i<str.length();) {
			int count = 1;
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
				else {
					break;
				}
			}
			if(count == 1) {
				res += str.charAt(i);
			}
			else {
				char next;
				res += str.charAt(i);
				if(str.charAt(i) == 'z') {
					next = 'a';
				}
				else {
					next = (char)(str.charAt(i)+1);
				}
				char temp = next;
				for(int k = 0; k<count-1; k++) {
					res += temp;
					temp++;
					if(temp > 'z') {
						temp = 'a';
					}
				}
			}
			i+=count;
		}
		System.out.println(res);
	}
}
