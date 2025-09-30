import java.util.*;

public class SortAlternateSubArray
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
		    arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int n = size/k;
		ArrayList<int[]> al = new ArrayList<>();
		for(int i=0; i<=size-k; i+=k) {
		    int[] subArr = new int[n];
		    int m = 0;
		    for(int j=i; j<i+k; j++) {
		        subArr[m++] = arr[j];
		    }
		    al.add(subArr);
		}
		for(int i=0; i<al.size(); i++) {
		    if(i%2==0) {
		        Arrays.sort(al.get(i));
		        for(int j=0; j<al.get(i).length; j++) { 
		            System.out.print(al.get(i)[j] + " ");
		        }
		    }
		    else {
		        for(int j=0; j<al.get(i).length; j++) { 
		            System.out.print(al.get(i)[j] + " ");
		        }
		    }
		}
	}
}
