import java.util.*;
public class VerticalLineCountNPoints {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] xAxis = new int[N];
		int[] yAxis = new int[N];
		for(int i=0; i<N; i++) {
		    xAxis[i] = sc.nextInt();
		    yAxis[i] = sc.nextInt();
		}
		int L = sc.nextInt();
		int count = 0;
		for(int i=0; i<N; i++) {
		    for(int j=i+1; j<N; j++) {
		        if(xAxis[i] == xAxis[j]) {
		            if(Math.abs(yAxis[i] - yAxis[j]) == L) {
		                count++;
		            }
		        }
		    }
		}
		System.out.println(count);
	}
}
