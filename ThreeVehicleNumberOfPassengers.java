import java.util.*;
public class ThreeVehicleNumberOfPassengers {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i=0; i<3; i++) {
		    arr[i] = sc.nextInt();
		}
		List<Integer> l = new ArrayList<>();
		for(int i=0; i<3; i++) {
		    l.add(arr[i]);
		}
		for(int i=0; i<3; i++) {
		    for(int j=i+1; j<3; j++) {
		        l.add(arr[i] + arr[j]);
		    }
		}
		l.add(arr[0] + arr[1] + arr[2]);
		Collections.sort(l);
		for(int i=0; i<l.size(); i++) {
		    System.out.print(l.get(i) + " ");
		}
	}
}
