import java.util.*;

public class GetMatrixFromArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];
		for(int i=0; i<num1; i++) {
		    arr1[i] = sc.nextInt();
		}
		int num2 = sc.nextInt();
		int[] arr2 = new int[num2];
		for(int i=0; i<num2; i++) {
		    arr2[i] = sc.nextInt();
		}
		int[] sin = new int[num1+num2];
		int k=0;
		for(int i=0; i<num1; i++) {
		    sin[k++] = arr1[i];
		}
		for(int i=0; i<num2; i++) {
		    sin[k++] = arr2[i];
		}
		System.out.println(Arrays.toString(sin));
		int size = (int) Math.sqrt(num1+num2);
		System.out.println(size);
		int x = 0;
		for(int i=0; i<size; i++) {
		    for(int j=0; j<size; ++) {
		        System.out.print(sin[x++] + " ");
		    }
		    System.out.println();
		}
		
	}
}
