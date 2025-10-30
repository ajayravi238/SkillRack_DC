import java.util.*;

public class CalculateTotalTime
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		int d = 0, h = 0, m = 0, s = 0;
		String[] arr = date.split(" ");
		for(int i=0; i<arr.length; i++) {
		    if(arr[i].charAt(arr[i].length()-1) == 'd') {
		        d += Integer.parseInt(arr[i].substring(0, arr[i].length()-1));
		    }
		    else if(arr[i].charAt(arr[i].length()-1) == 'h') {
		        h += Integer.parseInt(arr[i].substring(0, arr[i].length()-1));
		    }
		    else if(arr[i].charAt(arr[i].length()-1) == 'm') {
		        m += Integer.parseInt(arr[i].substring(0, arr[i].length()-1));
		    }
		    else if(arr[i].charAt(arr[i].length()-1) == 's') {
		        s += Integer.parseInt(arr[i].substring(0, arr[i].length()-1));
		    }
		}
		if(s >= 60) {
		    m += s/60;
		    s = s%60;
		}
		if(m >= 60) {
		    h += m/60;
		    m = m%60;
		}
		if(h >= 24) {
		    d += h/24;
		    h = h%24;
		}
		System.out.println(d + " " + h + " " + m + " " + s);
	}
}
