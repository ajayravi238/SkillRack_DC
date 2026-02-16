import java.util.*;

public class RemoveRowsWithSameValue
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
		List<int[]> list = new ArrayList<>();
		for(int i=0; i<R; i++) {
			int count = 0;
			for(int j=0; j<C-1; j++) {
				if(arr[i][j] == arr[i][j+1]) {
					count++;
				}
			}
			if(count < C-1) {
				int[] res = new int[C];
				for(int j=0; j<C; j++) {
					res[j] = arr[i][j];
				}
				list.add(res);
			}
		}
		if(list.isEmpty()) {
			System.out.println(-1);
		}
		else {
			for(int[] i : list) {
				for(int val : i) {
					System.out.print(val + " ");
				}
				System.out.println();
			}
		}
	}
}
