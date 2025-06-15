import java.util.*;

public class EvenLetterWords
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		System.out.println("Even length words: ");
		int flag = 0;
		for(int i=0; i<arr.length; i++) {
		    if(arr[i].length()%2 == 0) {
		        System.out.println(arr[i]);
		        flag = 1;
		    }
		}
		if(flag == 0) {
		    System.out.println("-1");
		}
	}
}
