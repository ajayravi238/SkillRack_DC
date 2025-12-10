import java.util.*;
public class TwoArraysCompareSizeAndDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A1 = sc.nextLine();
		String A2 = sc.nextLine();
		String[] arr1 = A1.split(" ");
		String[] arr2 = A2.split(" ");
		ArrayList<Character> ch1 = new ArrayList<>();
		ArrayList<Character> ch2 = new ArrayList<>();
		if(arr1.length == arr2.length) {
			for(int i=0; i<A1.length(); i++) {
				if(A1.charAt(i) != ' ') {
					ch1.add(A1.charAt(i));
				}
			}
			for(int i=0; i<A2.length(); i++) {
				if(A2.charAt(i) != ' ') {
					ch2.add(A2.charAt(i));
				}
			}
			Collections.sort(ch1);
			Collections.sort(ch2);
			int count = 0;
			for(int i=0; i<ch1.size(); i++) {
				if(ch1.get(i) != ch2.get(i)) {
					System.out.println("NO");
					return;
				}
				else {
					count++;
				}
			}
			long sum1 = 0, sum2 = 0;
			if(count == ch1.size()) {
				System.out.println("YES");
				for(int i=0; i<arr1.length; i++) {
					sum1 += Long.parseLong(arr1[i]);
					sum2 += Long.parseLong(arr2[i]);
				}
				System.out.println(sum1 + " " + sum2);
			}
		}
		else {
			System.out.println("NO");
		}
	}
}
