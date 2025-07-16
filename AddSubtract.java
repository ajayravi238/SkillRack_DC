import java.util.*;

public class AddSubtract
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] spt = str.split("[()]");
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0; i<spt.length; i++) {
		    if(!(spt[i].equals(""))) {
		        a.add(Integer.parseInt(spt[i]));
		    }
		}
		int sum = a.get(0);
		for(int i=1; i<a.size(); i++) {
		    if(i%2 != 0) {
		        sum += a.get(i);
		    }
		    else {
		        sum -= a.get(i);
		    }
		}
		System.out.println(sum);
	}
}
