import java.util.*;
public class ProductTotalPrice {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    int aCount = 0, bCount = 0, cCount = 0, dCount = 0, total = 0;
	    for(int i=0; i<str.length(); i++) {
	        if(str.charAt(i) == 'A') {
	            aCount++;
	        }
	        if(str.charAt(i) == 'B') {
	            bCount++;
	        }
	        if(str.charAt(i) == 'C') {
	            cCount++;
	        }
	        if(str.charAt(i) == 'D') {
	            dCount++;
	        }
	    }
	    total += bCount * 60;
	    total += dCount * 95;
	    total += (aCount%4) * 40;
	    total += (aCount/4) * 100;
	    total += (cCount%6) * 55;
	    total += (cCount/6) * 200;
	    System.out.println(total);
	}
}
