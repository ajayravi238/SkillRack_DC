import java.util.*;

public class SplitEvenLengthWords
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i++) {
		    if(arr[i].length()%2 == 0) {
		        System.out.print(arr[i].substring(0, arr[i].length()/2) + " " + arr[i].substring(arr[i].length()/2) + " ");
		    }
		    else {
		        System.out.print(arr[i] + " ");
		    }
		}
	}
}
