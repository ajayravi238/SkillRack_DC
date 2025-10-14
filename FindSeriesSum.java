import java.util.*;

public class FindSeriesSum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
		    int count = 0;
		    for(int j=0; j<arr[i].length(); j++) {
		        if(arr[i].charAt(j) == '0' || arr[i].charAt(j) == '1') {
		            count++;
		        }
		    }
		    if(count == arr[i].length()) {
		        sum += Integer.parseInt(arr[i], 2);
		    } else {
		        sum += Integer.parseInt(arr[i]);
		    }
		}
		System.out.println(sum);
	}
}



// 111  
