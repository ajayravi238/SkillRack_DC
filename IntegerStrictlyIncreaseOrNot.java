import java.util.*;
public class IntegerStrictlyIncreaseOrNot {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextLine();
		}
		String[] lArr = new String[num];
		for(int i=0; i<num; i++) {
		    lArr[i] = arr[i].toLowerCase();
		}
		for(int i=0; i<num; i++) {
		    for(int j=0; j<num-1; j++) {
		        if((int)lArr[j].charAt(lArr[j].length()-1) > (int)lArr[j+1].charAt(lArr[j+1].length()-1)) {
		            String temp = lArr[j];
		            lArr[j] = lArr[j+1];
		            lArr[j+1] = temp;
		        }
		    }
		}
		int[] numArr = new int[num];
		for(int i=0; i<num; i++) {
		    numArr[i] = Integer.parseInt(lArr[i].substring(0, lArr[i].length()-1));
		}
		int count = 0;
		for(int i=0; i<num-1; i++) {
		    if(numArr[i] < numArr[i+1]) {
		        count++;
		    }
		}
		if(count == num-1) {
		    System.out.println("Yes");
		}
		else {
		    System.out.println("No");
		}
	}
}
