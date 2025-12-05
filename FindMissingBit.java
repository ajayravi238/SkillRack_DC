import java.util.*;

public class FindMissingBit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bin = sc.nextLine();
		int N = sc.nextInt();
		String Nbin = Integer.toBinaryString(N);
		int count = 0;
		for(int i=0; i<bin.length(); i++) {
		    if(Nbin.charAt(i) != bin.charAt(i)) {
		        System.out.println(Nbin.charAt(i));
		    }
		    else {
		        count++;
		    }
		}
		if(count == bin.length()) {
		    System.out.println(Nbin.charAt(Nbin.length()-1));
		}
	}
}
