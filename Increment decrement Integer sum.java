import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		int[] res=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.next();
		    if(arr[i].length()==1 || arr[i].length()==2){
		        res[i]=Integer.parseInt(arr[i]);
		    }
		  
		    else if(arr[i].charAt(0)=='+' && arr[i].charAt(1)=='+'){
		        res[i]=(Integer.parseInt(arr[i].substring(2)))+1;
		    }
		    else if(arr[i].charAt(0)=='-' && arr[i].charAt(1)=='-'){
		        res[i]=(Integer.parseInt(arr[i].substring(2)))-1;
		    }
		    else if(arr[i].charAt(arr[i].length()-2)=='+' && arr[i].charAt(arr[i].length()-1)=='+'){
		        res[i]=(Integer.parseInt(arr[i].substring(0,arr[i].length()-2)))+1;
		    }
		    else if(arr[i].charAt(arr[i].length()-2)=='-' && arr[i].charAt(arr[i].length()-1)=='-'){
		        res[i]=(Integer.parseInt(arr[i].substring(0,arr[i].length()-2)))-1;
		    }
		    else{
		        res[i]=Integer.parseInt(arr[i]);
		    }
	}
	int sm=0;
    for(int i=0;i<res.length;i++){
        sm+=res[i];
    }
		System.out.println(sm);
    
		

	}
}
