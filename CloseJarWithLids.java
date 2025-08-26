import java.util.*;
public class CloseJarWithLids {

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
		int count = 0;
		for(int i=0; i<num-1; i++) {
		    if((arr[i]%2 != 0) && (arr[i+1] == arr[i]+1)) {
		        count++;
		    }
		}
		System.out.println(count);
	}
}
