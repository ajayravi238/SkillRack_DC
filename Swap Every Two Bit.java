import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String bin=Integer.toBinaryString(n);
	
		String rbin="";
		if(bin.length()%2==0){
		for(int i=0;i<bin.length()-1;i=i+2){
		    rbin+=bin.charAt(i+1);
		    rbin+=bin.charAt(i);
		}
		}
		else{
		    String w="";
		    w+='0';
		    w+=bin;
		   
		   for(int i=0;i<w.length()-1;i=i+2){
		    rbin+=w.charAt(i+1);
		    rbin+=w.charAt(i);
		}
		    
		}

		System.out.println(Integer.parseInt(rbin,2));

	}
}
