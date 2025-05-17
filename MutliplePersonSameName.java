import java.util.*;
public class MutliplePersonSameName {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] str = new String[num];
		for(int i=0; i<num; i++) {
		    str[i] = sc.nextLine();
		}
		Map<String, Integer> m = new LinkedHashMap<>();
		for(int i=0; i<num; i++) {
		    if(m.containsKey(str[i])) {
		        m.put(str[i], m.get(str[i])+1);
		        System.out.println(str[i] + "" + m.get(str[i]));
		    }
		    else {
		        m.put(str[i], 1);
		        System.out.println(str[i]);
		    }
		}
	}
}
