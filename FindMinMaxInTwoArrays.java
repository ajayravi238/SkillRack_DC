import java.util.*;

public class FindMinMaxInTwoArrays
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		int[] arr1 = new int[N1];
		int[] arr2 = new int[N2];
		for(int i=0; i<N1; i++) {
		    arr1[i] = sc.nextInt();
		}
		for(int i=0; i<N2; i++) {
		    arr2[i] = sc.nextInt();
		}
		int K = sc.nextInt();
		int gCount = 0, sCount = 0;
		for(int i=0; i<N1; i++) {
		    if(arr1[i] > K) {
		        gCount++;
		    }
		}
		for(int i=0; i<N2; i++) {
		    if(arr2[i] < K) {
		        sCount++;
		    }
		}
		if(gCount > sCount) {
		    System.out.println(gCount);
		} else {
		    System.out.println(sCount);
		}
	}
}
