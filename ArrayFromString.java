import java.util.*;

public class ArrayFromString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int N = sc.nextInt();
		List<String> res = new ArrayList<>();
		for(int i=0; i<str.length(); i+=N) {
		    res.add(str.substring(i, (N+i)));
		}
		int[] arr = new int[res.size()];
		for(int i=0; i<res.size(); i++) {
		    String s = "";
		    for(int j=0; j<res.get(i).length(); j++) {
		        if(res.get(i).charAt(j) != '0') {
		            s += res.get(i).charAt(j);
		        }
		    }
		    int len = s.length();
		    if(s.length() < N) {
		        for(int j=0; j<N-len; j++) {
		            s += '0';
		        }
		    }
		    System.out.print(s + " ");
		}
	}
}
