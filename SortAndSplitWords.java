import java.util.*;

public class SortAndSplitWords
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] file1 = new String[num];
		for(int i=0; i<num; i++) {
		    file1[i] = sc.nextLine();
		}
		String[] file2 = new String[num];
		for(int i=0; i<num; i++) {
		    file2[i] = sc.nextLine();
		}
		String[] sortArr = new String[num*2];
		int k = 0;
		for(int i=0; i<num; i++) {
		    sortArr[k++] = file1[i];
		    sortArr[k++] = file2[i];
		}
		Arrays.sort(sortArr);
		System.out.println("File 1: ");
		for(int i=0; i<num; i++) {
		    System.out.println(sortArr[i]);
		}
		System.out.println("File 2: ");
		for(int i=2; i<num*2; i++) {
		    System.out.println(sortArr[i]);
		}
	}
}
