import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] num=str.split("[A-Z a-z]");
		String[] apl=str.split("[0-9]");
		String n="";
		for(int i=0;i<apl.length;i++){
		    if(apl[i]!=""){
		        n+=apl[i];
		    }
		}
// 		System.out.println(Arrays.toString(num));
// 		System.out.println(n);
        for(int i=0;i<num.length;i++){
            for(int j=0;j<Integer.parseInt(num[i]);j++){
            System.out.print(n.substring(i));
            }
            System.out.println();
        }
	}
}
