import java.util.*;

public class WordWithSeparator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.next();
		}
		char sep = sc.next().charAt(0);
		for(int i=0; i<num; i++) {
		    if(i == num-1) {
		        System.out.print(arr[i]);
		    }
		    else {
		        System.out.print(arr[i] + sep);
		    }
		}
	}
}
