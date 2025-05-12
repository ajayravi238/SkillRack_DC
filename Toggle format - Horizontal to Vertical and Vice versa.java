import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> words = new ArrayList<>();
		while(sc.hasNextLine()) {
		    String str = sc.nextLine().trim();
		    if(str.contains(" ")) {
		        words = Arrays.asList(str.split(" "));
		        for(int i=words.size()-1; i>=0; i--) {
		            System.out.println(words.get(i));
		        }
		        System.out.println(words.size());
		        return;
		    }
		    else {
		        words.add(str);
		    }
		}
		        for(int i=words.size()-1; i>=0; i--) {
		            System.out.print(words.get(i) + " ");
		        }
		        System.out.println();
		        System.out.println(words.size());
	}
}
