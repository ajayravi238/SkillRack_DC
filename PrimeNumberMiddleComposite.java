import java.util.*;
public class PrimeNumberMiddleComposite {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = num-1, b = num+1;
		if(!(isPrime(num))) {
		    while(!isPrime(a)) {
		        a--;
		    }
		    while(!isPrime(b)) {
		        b++;
		    }
		}
		else {
		    System.out.println(-1);
		    return;
		}
		if((a+b)/2 == num) {
		    System.out.println(a + " " + b);
		}
		else {
		    System.out.println(-1);
		}
	}
	
	public static boolean isPrime(int n) {
	    if(n == 0 || n == 1) {
	        return false;
	    }
	    for(int i=2; i<n; i++) {
	        if(n%i==0) {
	            return false;
	        }
	    }
	    return true;
	}
}
