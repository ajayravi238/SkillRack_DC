import java.util.*;

public class RemoveFruitAndSum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] quantity = new String[num];
		for(int i=0; i<num; i++) {
		    quantity[i] = sc.nextLine();
		}
// 		System.out.println(Arrays.toString(quantity));
		int remove = sc.nextInt();
		System.out.println(num);
		int sum = 0;
		for(int i=0; i<num; i++) {
		    String[] item = quantity[i].split(" ");
		    sum += Integer.parseInt(item[1]);
		}
		System.out.println(sum);
		int sum1 = 0;
		for(int i=0; i<num; i++) {
		    if(i != (remove-1)) {
		        String[] item = quantity[i].split(" ");
		        System.out.println(item[0] + " : " + item[1]);
		        sum1 += Integer.parseInt(item[1]);
		    }
		}
		System.out.println(remove);
		System.out.println(sum1);
	}
}
