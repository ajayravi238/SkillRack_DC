import java.util.*;

public class AlphabetBitMasking
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    Set<Character> set=new HashSet<>();
		for(int i=0;i<str.length();i++){
		    set.add(str.charAt(i));
		}
		ArrayList<Character> as=new ArrayList<>(set);
		
		int[] arr=new int[26];
		for(int i=0;i<set.size();i++){
		    arr[((int)(as.get(i)))-97]++;
		}
		String res="";
		for(int i=25;i>=0;i--){
		    res+=arr[i];
		}
		System.out.println(Integer.parseInt(res,2));
		
	}
}
