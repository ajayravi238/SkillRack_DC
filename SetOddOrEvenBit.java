import java.util.*;
public class SetOddOrEvenBit {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String bin = Integer.toBinaryString(N);
		StringBuilder sb = new StringBuilder(bin).reverse();
		StringBuilder res = new StringBuilder();
		if(N%2 == 0) {
		    for(int i=0; i<bin.length(); i++) {
		        if(i%2 != 0) {
		            res.append('1');
		        } else {
		            res.append(sb.charAt(i));
		        }
    		}
		}
		else {
		    for(int i=0; i<bin.length(); i++) {
		        if(i%2 == 0) {
		            res.append('1');
		        }
		        else {
		            res.append(sb.charAt(i));
		        }
		    }
		}
		String fin = res.reverse().toString();
		System.out.println(Integer.parseInt(fin, 2));
	}
}
