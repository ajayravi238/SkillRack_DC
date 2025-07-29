import java.util.*;
public class NthNumberDoubleJumboSequence {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 0) {
		    System.out.println("0");
		}
		else if(num == 1) {
		    System.out.println("1");
		}
		else {
		    long[] arr = new long[num];
		    arr[0] = 0;
		    arr[1] = 1;
		    for(int i=2; i<num; i++) {
		        arr[i] = 1*arr[i-1] + 2*arr[i-2] + 3;
		    }
		    System.out.println(arr[num-1]);
		}
	}
}
