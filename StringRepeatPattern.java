import java.util.*;
public class StringRepeatPattern {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		for(int i=0; i<s2.length(); i++){
		    int y = Character.getNumericValue(s2.charAt(i));
		    for(int j=0; j<y; j++) {
		        System.out.print(s1.substring(0, i+1));
		    }
		    System.out.println();
		}
	}
}
