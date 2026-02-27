import java.util.*;
public class FrequencyShiftEncryption {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Map<Character, Integer> m = new LinkedHashMap<>();
		for(int i=0; i<str.length(); i++) {
		    if(m.containsKey(str.charAt(i))) {
		        m.put(str.charAt(i), m.get(str.charAt(i))+1);
		    } else {
		        m.put(str.charAt(i), 1);
		    }
		}
		StringBuilder res = new StringBuilder();
		for(int i=str.length()-1; i>=0; i--) {
		    char ch = str.charAt(i);
		    int count = m.get(str.charAt(i));
		    if(count == 1) {
		        res.append(ch);
		    } else {
		        int shift = count-1;
		        char newCh = (char) ('a' + (ch-'a'+shift)%26);
		        res.append(newCh);
		        m.put(ch, count-1);
		    }
		}
		System.out.println(res.reverse().toString());
	}
}
