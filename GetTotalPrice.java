import java.util.*;

public class GetTotalPrice
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		float sum = 0.0f;
		for(int i=0; i<arr.length-1; i++) {
		    if(arr[i].equals("is")) {
		        if(arr[i+1].charAt(arr[i+1].length()-1) == ',' || arr[i+1].charAt(arr[i+1].length()-1) == '.') {
		            sum += Float.parseFloat(arr[i+1].substring(0, arr[i+1].length()-1));
		        } else {
		            sum += Float.parseFloat(arr[i+1]);
		        }
		    }
		}
		System.out.printf("%.2f", sum);
	}
}
