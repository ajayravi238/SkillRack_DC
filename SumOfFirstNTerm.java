import java.util.*;
public class SumOfFirstNTerm {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 0, sum = 0, a = 1;
		while(i <= N) {
		    for(int j=1; j<=a; j++) {
		        i++;
		        if(i>N) {
		            break;
		        }
		        sum += j;
		    }
		    a++;
		}
		System.out.println(sum);
	}
}
