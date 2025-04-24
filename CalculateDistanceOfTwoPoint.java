import java.util.*;
public class CalculateDistanceOfTwoPoint
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pt1 = sc.nextLine();
		String pt2 = sc.nextLine();
		
		String[] arr1 = pt1.split(" ");
		int x1 = Integer.parseInt(arr1[0]);
		int y1 = Integer.parseInt(arr1[1]);
		String[] arr2 = pt2.split(" ");
		int x2 = Integer.parseInt(arr2[0]);
		int y2 = Integer.parseInt(arr2[1]);
		
		int xsq = (x2-x1)*(x2-x1);
		int ysq = (y2-y1)*(y2-y1);
		
		System.out.printf("%.2f", Math.sqrt(xsq + ysq));
	}
}
