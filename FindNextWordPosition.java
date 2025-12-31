import java.util.*;

public class FindNextWordPosition
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
		    char ch = arr[i].charAt(arr[i].length()-1);
		    int count = 0;
		    for(int j=(i+1)%arr.length; j!=i; j=(j+1)%arr.length) {
		        if(arr[j].charAt(arr[j].length()-1) == ch) {
		            System.out.print((j+1) + " ");
		            break;
		        }
		        else {
		            count++;
		        }
		    }
		    if(count == arr.length-1) {
		        System.out.print(i+1 + " ");
		    }
		}
	}
}
