import java.util.*;
public class SplitOdometerKSecond {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int K = sc.nextInt();
		List<Integer> al = new ArrayList<>();
		for(int i=0; i<=S.length()-3; i+=3) {
		    al.add(Integer.parseInt(S.substring(i, i+3)));
		}
		for(int i=0; i<K; i++) {
		    for(int j=0; j<al.size(); j++) {
		        StringBuilder sb = new StringBuilder();
		        int a = al.get(j) + 1;
		        String str = String.valueOf(a);
		        if(str.length() < 3) {
		            for(int k=0; k<3-str.length(); k++) {
		                sb.append('0');
		            }
		            sb.append(str);
		        }
		        else if(str.length() > 3) {
		            sb.append(str.substring(1));
		        }
		        else {
		            sb.append(str);
		        }
		        System.out.print(sb);
		        al.set(j, (al.get(j) + 1));
		    }
		    System.out.println();
		}
	}
}
