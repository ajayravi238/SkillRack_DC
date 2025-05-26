import java.util.*;

public class UpdateSumAndQueries
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String[] str=sc.nextLine().split(" ");
	    int[] arr=new int[str.length];
	    for(int i=0;i<str.length;i++){
	        arr[i]=Integer.parseInt(str[i]);
	    }
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++){
	        int q=sc.nextInt();
	        int sr=sc.nextInt();
	        int er=sc.nextInt();
	        if(q==1){
	            int add=sc.nextInt();
	            for(int j=sr-1;j<er;j++){
	               arr[j] = arr[j]+add;
	            }
	             
	        }
	        else{
	            int sum=0;
	            for(int j=sr-1;j<er;j++){
	                sum+=arr[j];
	            }
	            System.out.println(sum);
	        }
	    }
	}
}
