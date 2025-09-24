import java.util.*;
public class PrintFrequencyRightToLeft {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Map<Character, Integer> m = new LinkedHashMap<>();
		int[] occ = new int[str.length()];
		char[] ch = new char[str.length()];
		for(int i=str.length()-1; i>=0; i--) {
		    if(m.containsKey(str.charAt(i))) {
		        m.put(str.charAt(i), m.get(str.charAt(i))+1);
		        occ[i] = m.get(str.charAt(i));
		        ch[i] = str.charAt(i);
		    }
		    else {
		        m.put(str.charAt(i), 1);
		        occ[i] = m.get(str.charAt(i));
		        ch[i] = str.charAt(i);
		    }
		}
		for(int i=0; i<str.length(); i++) {
		    System.out.print(ch[i] + "" + occ[i] + " ");
		}
	}
}
