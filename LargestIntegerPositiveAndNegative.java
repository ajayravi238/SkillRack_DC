import java.util.*;
public class LargestIntegerPositiveAndNegative {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextInt();
		}
		for(int i=0; i<num; i++) {
		    for(int j=0; j<num-1; j++) {
		        if(arr[j] > arr[j+1]) {
		            int temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
		        }
		    }
		}
		int flag = 0;
		for(int i=0; i<num-1; i++) {
		    for(int j=i+1; j<num; j++) {
		        if(arr[i] < 0 && Math.abs(arr[i]) == arr[j]) {
		            System.out.println(arr[j]);
		            flag = 1;
		            return;
		        }
		    }
		}
		if(flag == 0) {
		    System.out.println("-1");
		}
	}
}
