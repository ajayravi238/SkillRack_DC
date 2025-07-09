import java.util.*;
public class AscendingDescendingArray {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int[] arr1 = new int[M];
		for(int i=0; i<M; i++) {
		    arr1[i] = sc.nextInt();
		}
		int N = sc.nextInt();
		int[] arr2 = new int[N];
		for(int i=0; i<N; i++) {
		    arr2[i] = sc.nextInt();
		}
		if(arr1[0] < arr1[M-1]) {
		    for(int i=0; i<M; i++) {
		        System.out.print(arr1[i] + " ");
		    }
		    System.out.println();
		    for(int i=0; i<N; i++) {
		        System.out.print(arr2[i] + " ");
		    }
		}
		else if(arr2[0] < arr2[N-1]) {
		    for(int i=0; i<N; i++) {
		        System.out.print(arr2[i] + " ");
		    }
		    System.out.println();
		    for(int i=0; i<M; i++) {
		        System.out.print(arr1[i] + " ");
		    }
		}
		else if(arr1[0] == arr1[M-1] && arr2[0] == arr2[N-1] && arr1[0] != arr2[0]) {
		    if(arr1[0] > arr2[0]) {
		        for(int i=0; i<N; i++) {
		            System.out.print(arr2[i] + " ");
		        }
		        System.out.println();
		        for(int i=0; i<M; i++) {
		            System.out.print(arr1[i] + " ");
		        }
		    }
		    else {
		        for(int i=0; i<M; i++) {
		            System.out.print(arr1[i] + " ");
		        }
		        System.out.println();
		        for(int i=0; i<N; i++) {
		            System.out.print(arr2[i] + " ");
		        }
		    }
		}
		else if(arr1[0] == arr1[M-1]) {
		    for(int i=0; i<M; i++) {
		        System.out.print(arr1[i] + " ");
		    }
		    System.out.println();
		    for(int i=0; i<N; i++) {
		        System.out.print(arr2[i] + " ");
		    }
		}
		else if(arr2[0] == arr2[N-1]) {
		    for(int i=0; i<N; i++) {
		        System.out.print(arr2[i] + " ");
		    }
		    System.out.println();
		    for(int i=0; i<M; i++) {
		        System.out.print(arr1[i] + " ");
		    }
		}
		else {
		    for(int i=0; i<M; i++) {
		        System.out.print(arr1[i] + " ");
		    }
		    System.out.println();
		    for(int i=0; i<N; i++) {
		        System.out.print(arr2[i] + " ");
		    }
		}
	}
}
