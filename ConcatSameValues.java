import java.util.*;

public class ConcatSameValues
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<N; i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else {
				hm.put(arr[i], 1);
			}
		}
		List<Integer> al = new ArrayList<>();
		for(Map.Entry<Integer, Integer> e : hm.entrySet()) {
			int c = 0, s = 0;
			if(e.getValue()%2 == 0) {
				c = e.getValue()/2;
			}
			else {
				c = e.getValue()/2;
				s = e.getValue()%2;
			}
			String res = "";
			for(int j=0; j<c; j++) {
				res += e.getKey();
				res += e.getKey();
			}
			if(!res.isEmpty()) {
				int a = Integer.parseInt(res);
				al.add(a);
			}
			if(s != 0) {
				al.add(e.getKey());
			}
		}
		Collections.sort(al);
		for(int i : al) {
		    System.out.print(i + " ");
		}
	}
}
