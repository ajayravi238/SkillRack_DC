import java.util.*;

public class FindMissingInteger
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int[][] arr = new int[R][C];
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		List<Integer> l = new ArrayList<>();
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				l.add(arr[i][j]);
			}
		}
		Collections.sort(l);
		int missingNum = 0;
		for(int i=0; i<l.size()-1; i++) {
		     if(l.get(i) > 0 && l.get(i)+1 != l.get(i+1)) {
		         missingNum = l.get(i)+1;
		     }
		}
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        if(arr[i][j] != -1) {
		            System.out.print(arr[i][j] + " ");
		        }
		        else {
		            System.out.print(missingNum + " ");
		        }
		    }
		    System.out.println();
		}
	}
}
