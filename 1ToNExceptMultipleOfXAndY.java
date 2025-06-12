import java.util.*;
public class 1ToNExceptMultipleOfXAndY
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int X=sc.nextInt();
		int Y=sc.nextInt();
		for(int i=1; i<=N; i++) {
			if(i%X!=0 && i%Y!=0) {
				System.out.print(i+" ");
			}
		}
	}
}
