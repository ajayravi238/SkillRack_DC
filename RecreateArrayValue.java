import java.util.*;

public class RecreateArrayValue
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int[] arr = new int[Y-X+1];
		for(int i=0; i<arr.length; i++) {
		    arr[i] = sc.nextInt();
		}
		int k = 0;
		int[] num = new int[Y-X+1];
		for(int i=X; i<=Y; i++) {
		    num[k++] = i;
		}
		for(int i=0; i<arr.length; i++) {
		    System.out.print(num[arr[i]-1] + " ");
		}
	}
}
