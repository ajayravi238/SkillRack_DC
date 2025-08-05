import java.util.*;
public class FindTimeBinaryClock {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[4];
		for(int i=0; i<4; i++) {
		    arr[i] = sc.nextLine();
		}
		String h1 = "", h2 = "", m1 = "", m2 = "", s1 = "", s2 = "";
		for(int i=0; i<4; i++) {
		    h1 += arr[i].charAt(0);
		    h2 += arr[i].charAt(1);
		    m1 += arr[i].charAt(3);
		    m2 += arr[i].charAt(4);
		    s1 += arr[i].charAt(6);
		    s2 += arr[i].charAt(7);
		}
		System.out.println(Integer.parseInt(h1, 2) + "" + Integer.parseInt(h2, 2) + ":" + Integer.parseInt(m1, 2) + "" + Integer.parseInt(m2, 2) + ":"+ Integer.parseInt(s1, 2) + "" + Integer.parseInt(s2, 2));
	}
}
