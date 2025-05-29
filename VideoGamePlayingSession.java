import java.util.*;
public class VideoGamePlayingSession {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int X=sc.nextInt();
		int Y=sc.nextInt();
		String[] arr=str.split(" ");
		String startTime=arr[0];
		String[] brr=startTime.split(":");
		int shr=Integer.parseInt(brr[0]);
		int sm=Integer.parseInt(brr[1]);
		String endTime=arr[1];
		String[] err=endTime.split(":");
		int ehr=Integer.parseInt(err[0]);
		int em=Integer.parseInt(err[1]);
		int strm=0;
		int strhr=0;
	
		
		int flag=0;
		while(shr<=ehr){
		    strm=sm;
		    strhr=shr;

		sm+=X;
		if(sm>60){
		    shr+=(sm/60);
		    sm=(sm%60);
		   
		}
		if(sm==60){
		    sm=0;
		    shr+=1;
		}
	    //16:07
        if(shr==ehr){
            if(sm>em){
            if(flag==0){
                System.out.println("-1");
            }
            return;
            }
        }
        if(shr>ehr){
            if(flag==0){
                System.out.println("-1");
            }
            return;
        }
        
        String min=String.format("%02d",strm);
        String hr=String.format("%02d",strhr);
        System.out.print(hr+":"+min+" - ");
		
	    String mi=String.format("%02d",sm);
	    String h=String.format("%02d",shr);
		System.out.println(h+":"+mi);
		flag=1;
		sm+=Y;
		if(sm>60){
		    shr+=(sm/60);
		    sm=(sm%60); 
		    
		}
		if(sm==60){
		    sm=0;
		    shr+=1;
		}
    }
	}
}
