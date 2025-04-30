import java.util.*;
public class SwapTwoVowels {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		ArrayList<Integer> index = new ArrayList<>();
		ArrayList<Character> vowel = new ArrayList<>();
		for(int i=0; i<str.length(); i++) {
		    if(str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
		        index.add(i);
		        vowel.add(str.charAt(i));
		    }
		}
		for(int i=0; i<index.size()-1; i+=2) {
		    char temp = vowel.get(i);
		    vowel.set(i, vowel.get(i+1));
		    vowel.set(i+1, temp);
		}
		for(int i=0; i<index.size(); i++) {
		    arr[index.get(i)] = vowel.get(i);
		}
		for(int i=0; i<arr.length; i++) {
		    System.out.print(arr[i]);
		}
	}
}
