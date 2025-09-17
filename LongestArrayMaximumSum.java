import java.util.*;
public class LongestArrayMaximumSum {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		ArrayList<String[]> al = new ArrayList<>(N);
		for(int i=0; i<N; i++) {
		    String str = sc.nextLine();
		    al.add(str.split(" "));
		}
		int max = Integer.MIN_VALUE;
		for(int i=0; i<N; i++) {
		    if((al.get(i)).length > max) {
		        max = (al.get(i)).length;
		    }
		}
		int maxSum = 0;
		for(int i=0; i<N; i++) {
		    if(al.get(i).length == max) {
		        int sum = 0;
		        for(int j=0; j<al.get(i).length; j++) {
		            sum += Integer.parseInt(al.get(i)[j]);
		        }
		        if(sum > maxSum) {
		            maxSum = sum;
		        }
		    }
		}
		System.out.println(maxSum);
	}
}
