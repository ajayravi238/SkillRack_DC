import java.util.*;

public class ProductSign
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextInt();
		}
		int nCount = 0;
		for(int i=0; i<num; i++) {
		    if(arr[i] == 0) {
		        System.out.println(0);
		        return;
		    }
		    else if(arr[i] < 0) {
		        nCount++;
		    }
		}
		if(nCount%2 == 0) {
		    System.out.println(1);
		}
		else {
		    System.out.println(-1);
		}
	}
}
