import java.util.*;
public class EvaluateExpressionOperatorAsWord {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		int res = Integer.parseInt(arr[0]);
		for(int i=0; i<arr.length-1; i++) {
		    if(i%2 != 0) {
		        if(arr[i].charAt(0) == 'p') {
		            res += Integer.parseInt(arr[i+1]);
		        }
		        else if(arr[i].charAt(0) == 'm' && arr[i].charAt(1) == 'i') {
		            res -= Integer.parseInt(arr[i+1]);
		        }
		        else if(arr[i].charAt(0) == 'm' && arr[i].charAt(1) == 'u') {
		            res *= Integer.parseInt(arr[i+1]);
		        }
		        else if(arr[i].charAt(0) == 'd') {
		            res /= Integer.parseInt(arr[i+1]);
		        }
		    }
		}
		System.out.println(res);
	}
}
