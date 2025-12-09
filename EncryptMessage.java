import java.util.*;

public class EncryptMessage
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();
		String key = sc.nextLine();
		String alp = "";
		for(char i='a'; i<='z'; i++) {
		    alp += i;
		}
		String encrypt = "";
		encrypt += key;
		for(char i='a'; i<='z'; i++) {
		    int count = 0;
		    for(int j=0; j<key.length(); j++) {
		        if(i != key.charAt(j)) {
		            count++;
		        }
		    }
		    if(count == key.length()) {
		        encrypt += i;
		    }
		}
		String res = "";
		for(int i=0; i<message.length(); i++) {
		    for(int j=0; j<26; j++) {
		        if(message.charAt(i) == alp.charAt(j)) {
		            res += encrypt.charAt(j);
		        }
		    }
		}
		System.out.println(res);
	}
}
