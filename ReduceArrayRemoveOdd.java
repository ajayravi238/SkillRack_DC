import java.util.*;
public class ReduceArrayRemoveOdd {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> l = new ArrayList<>();
		for(int i=0; i<N; i++) {
		    l.add(sc.nextInt());
		}
		while(l.size() > 0) {
		    ArrayList<Integer> res = new ArrayList<>();
		    for(int i=0; i<l.size(); i++) {
		        System.out.print(l.get(i)/2 + " ");
		        if((l.get(i)/2)%2 == 0) {
		            res.add(l.get(i)/2);
		        }
		    }
		    System.out.println();
		    l = res;
		}
	}
}
