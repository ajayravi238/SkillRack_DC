import java.util.*;
public class FatherAndSonFindHappiness {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		int min = arr[0], max = arr[0];
		int happy = 0, sad = 0, fine = 1;
		for(int i=1; i<N; i++) {
		    if(max < arr[i]) {
		        max = arr[i];
		        happy++;
		    }
		    else if(min > arr[i]) {
		        min = arr[i];
		        sad++;
		    }
		    else {
		        fine++;
		    }
		}
		System.out.println(happy + " " + fine + " " + sad);
	}
}
