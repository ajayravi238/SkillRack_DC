import java.util.*;
public class DescendingOrAscendingOrEqual {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int  i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		if(arr[0]==arr[n-1]){
		    System.out.println("Equal");
		}
		else if(arr[0]>arr[n-1]){
		    System.out.println("Descending");
		}
		else{
		    System.out.println("Ascending");
		}

	}
}
