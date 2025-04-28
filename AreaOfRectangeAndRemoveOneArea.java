import java.util.*;
public class AreaOfRectangeAndRemoveOneArea
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] l = new int[num];
		int[] b = new int[num];
		for(int i=0; i<num; i++) {
		    l[i] = sc.nextInt();
		    b[i] = sc.nextInt();
		}
		int rem = sc.nextInt();
		System.out.println(num);
		int sum = 0;
		for(int i=0; i<num; i++) {
		    sum += (l[i] * b[i]);
		}
		System.out.println(sum);
		int add = 0;
		for(int i=0; i<num; i++) {
		    if(i != rem-1) {
		        System.out.println("Length = " + l[i] + ", Breathe = " + b[i] + ", Area = " + l[i]*b[i]);
		        add += (l[i] * b[i]);
		    }
		}
		System.out.println(num-1);
		System.out.println(add);
	}
}
