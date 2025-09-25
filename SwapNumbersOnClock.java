import java.util.*;
public class SwapNumbersOnClock {

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] r = new int[N];
		int[] c = new int[N];
		for(int i=0; i<N; i++) {
		    r[i] = s.nextInt(); //12 9 8
		    c[i]=s.nextInt(); //4 7 12
		}
	//	System.out.println(Arrays.toString(c));
		String[][] clock = new String[5][5];
		clock[0][0] = "*";
		clock[0][1] = "11";
		clock[0][2] = "12";
		clock[0][3] = "1";
		clock[0][4] = "*";
		clock[1][0] = "10";
		clock[1][1] = "*";
		clock[1][2] = "*";
		clock[1][3] = "*";
		clock[1][4] = "2";
		clock[2][0]="9";
		clock[2][1]="*";
		clock[2][2]="*";
		clock[2][3]="*";
		clock[2][4]="3";
		clock[3][0]="8";
		clock[3][1]="*";
		clock[3][2]="*";
		clock[3][3]="*";
		clock[3][4]="4";
		clock[4][0]="*";
		clock[4][1]="7";
		clock[4][2]="6";
		clock[4][3]="5";
		clock[4][4]="*";
		
		       for(int k=0;k<N;k++){
		           int fr=0,fc=0,sr=0,sc=0;
		           for(int i=0;i<5;i++){
		               for(int j=0;j<5;j++){
		           if(String.valueOf(r[k]).equals(clock[i][j])){
		               fr=i;
		               fc=j;
		           }
		           if(String.valueOf(c[k]).equals(clock[i][j])){
		             
		              sr=i;
		              sc=j;
		           }
		               }
		           }
		           String t=clock[fr][fc];//12
		        
		           clock[fr][fc]=clock[sr][sc];//4
		          
		           clock[sr][sc]=t;
		       
		   
		}
		for(int i=0;i<5;i++){
		    for(int j=0;j<5;j++){
		        System.out.print(clock[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
