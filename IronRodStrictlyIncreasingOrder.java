import java.util.*;
public class IronRodStrictlyIncreasingOrder {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		int sum = 0, rod = arr[0];
		for(int i=0; i<N; i++) {
		    sum += arr[i];
		}
		List<Integer> res = new ArrayList<>();
		int i = arr[0];
		while(sum > rod) {
		    res.add(i);
		    rod += i;
		    i++;
		}
		for(int a : res) {
		    System.out.print(a + " ");
		}
	}
}
