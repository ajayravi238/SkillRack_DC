import java.util.*;
public class MoveToBeginningOperationsCount {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int count = 0;
		String res = str;
		while(true) {
		    res = res.substring(str.length()-X) + res.substring(0, str.length()-X);
		    count++;
		    if(res.equals(str)) {
		        break;
		    }
		    res = res.substring(str.length()-Y) + res.substring(0, str.length()-Y);
		    count++;
		    if(res.equals(str)) {
		        break;
		    }
		}
		System.out.println(count);
	}
}
