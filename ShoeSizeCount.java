import java.util.*;

public class ShoeSizeCount
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<N; i++) {
		    if(hm.containsKey(arr[i])) {
		        hm.put(arr[i], hm.get(arr[i])+1);
		    }
		    else {
		        hm.put(arr[i], 1);
		    }
		}
		int count = 0;
		for(Map.Entry<Integer, Integer> e : hm.entrySet()) {
		    count += (e.getValue()/2);
		}
		System.out.println(count);
	}
}
