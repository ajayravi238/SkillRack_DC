import java.util.*;

public class RemoveMiddle
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextInt();
		    if(i != (num/2)) { 
		        System.out.print(arr[i] + " ");
		    }
		}
		System.out.println();
		for(int i=num-1; i>=0; i--) {
		    if(i != (num/2)) {
		        System.out.print(arr[i] + " ");
		    }
		}
	}
}
