import java.util.*;
public class CitiesCountTower {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char[][] arr = new char[num1][num2];
		for(int i=0; i<num1; i++) {
		    for(int j=0; j<num2; j++) {
		        arr[i][j] = sc.next().charAt(0);
		    }
		}
		for(int i=0; i<num1; i++) {
		    for(int j=0; j<num2; j++) {
		        if(arr[i][j] == 'S' && j == 0) {
		            if(i == num1-1){
		                arr[i][j+1] = '#';
		                arr[i-1][j] = '#';
		                arr[i+1][j+1] = '#';
		                arr[i][j] = '#';
		            }
		            else if(i<num1-1) {
		                arr[i-1][j] = '#';
		                arr[i-1][j+1] = '#';
		                arr[i][j+1] = '#';
		                arr[i+1][j+1] ='#';
		                arr[i+1][j] = '#';
		                arr[i][j] = '#';
		            }
		        }
		        else if(arr[i][j] == 'S' && i == 0) {
		            if(j == 0) {
		                arr[i][j+1] = '#';
		                arr[i+1][j+1] = '#';
		                arr[i+1][j] = '#';
		                arr[i][j] = '#';
		            }
		            else if(j<num2-1) {
		                arr[i][j-1] = '#';
		                arr[i+1][j-1] = '#';
		                arr[i+1][j] = '#';
		                arr[i+1][j+1] = '#';
		                arr[i][j+1] = '#';
		                arr[i][j] = '#';
		            }
		        }
		        else if(arr[i][j] == 'S' && j == num2-1) {
		            if(i == 0) {
		            arr[i][j-1] = '#';
		            arr[i+1][j-1] = '#';
		            arr[i+1][j] = '#';
		            arr[i][j] = '#';
		            }
		            else if(i < num1-1) {
		                arr[i-1][j] = '#';
		                arr[i-1][j-1] = '#';
		                arr[i][j-1] = '#';
		                arr[i+1][j-1] = '#';
		                arr[i+1][j] = '#';
		                arr[i][j] = '#';
		            }
		        }
		        else if(arr[i][j] == 'S' && i == num1-1) {
		            if(j == num2-1) {
		                arr[i-1][j] = '#';
		                arr[i-1][j-1] = '#';
		                arr[i][j-1] = '#';
		                arr[i][j] = '#';
		            }
		            else if(j < num2-1) {
		                arr[i][j-1] = '#';
		                arr[i-1][j-1] = '#';
		                arr[i-1][j] = '#';
		                arr[i-1][j+1] = '#';
		                arr[i][j+1] = '#';
		                arr[i][j] = '#';
		            }
		        }
		        else if(arr[i][j] == 'S') {
		            arr[i][j-1] = '#';
		            arr[i-1][j-1] = '#';
		            arr[i-1][j] = '#';
		            arr[i+1][j+1] = '#';
		            arr[i][j+1] = '#';
		            arr[i+1][j] = '#';
		            arr[i+1][j-1] = '#';
		            arr[i-1][j+1] = '#';
		            arr[i][j] = '#';
		        }
		    }
	
		}
		int c=0;
		for(int i=0; i<num1; i++) {
		    for(int j=0; j<num2; j++) {
		        System.out.print(arr[i][j]+" ");
		        if(arr[i][j]=='#'){
		            c++;
		        }
		        
		    }
		    System.out.println();
		    
		}
		System.out.println(c);
	}
}
