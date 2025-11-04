import java.util.*;
public class BoxesAndBalls {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] NBox = new int[N];
		for(int i=0; i<N; i++) {
		    NBox[i] = sc.nextInt();
		}
		Arrays.sort(NBox);
		int[] NBall = new int[N];
		for(int i=0; i<N; i++) {
		    NBall[i] = sc.nextInt();
		}
		Arrays.sort(NBall);
		int count = 0;
		for(int i=0; i<N; i++) {
		    if(NBox[i] > NBall[i]) {
		        count++;
		    }
		}
		if(count == N) {
		    System.out.println("YES");
		} else {
		    System.out.println("NO");
		}
	}
}
