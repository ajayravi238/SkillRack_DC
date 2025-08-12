import java.util.*;
public class IntegersAddReminder {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		for(int i=0; i<k; i++) {
		    for(int j=k; j<num; j++) {
		        arr[j] += (arr[j] % arr[i]);
		    }
		}
		for(int i=0; i<num; i++) {
		    System.out.print(arr[i] + " ");
		}
	}
}
