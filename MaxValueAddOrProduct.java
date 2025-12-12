import java.util.*;
public class MaxValueAddOrProduct {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++) {
		    int sum = 0, mul = 1;
		    while(arr[i] != 0) {
		        int rem = arr[i] % 10;
		        sum += rem;
		        mul *= rem;
		        arr[i] /= 10;
		    }
		    if(sum > mul) {
		        System.out.print(sum + " ");
		    }
		    else {
		        System.out.print(mul + " ");
		    }
		}
	}
}
