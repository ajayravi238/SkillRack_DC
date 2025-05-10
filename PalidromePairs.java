import java.util.*;
public class PalidromePairs {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] str = s.split(" ");
		int len = str.length;
		int flag = 0;
		for(int i=0; i<len; i++) {
		    for(int j=0; j<len; j++) {
		        if(i != j) {
		            String comb = str[i] + str[j];
		            if(pali(comb)) {
		                System.out.println(comb);
		                flag = 1;
		            }
		        }
		    }
		}
		if(flag == 0) {
		    System.out.println("-1");
		}
	}
	public static boolean pali(String s) {
	    String rev = "";
	    for(int i=s.length()-1; i>=0; i--) {
	        rev += s.charAt(i);
	    }
	    if(s.equals(rev)) {
	        return true;
	    }
	    return false;
	}
}
