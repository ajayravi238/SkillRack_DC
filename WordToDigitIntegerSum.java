import java.util.*;
public class WordToDigitIntegerSum {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.next();
		}
		int sum = 0;
		String[] res = new String[N];
		for(int i=0; i<N; i++) {
		    String str = "";
		    for(int j=0; j<arr[i].length(); j++) {
		        if(arr[i].charAt(j) >= '0' && arr[i].charAt(j) <= '9') {
		            str += arr[i].charAt(j);
		        }
		        else {
		            if(arr[i].charAt(j) == 'z') {
		                str += '0';
		                j+=3;
		            }
		            else if(arr[i].charAt(j) == 'o') {
		                str += '1';
		                j+=2;
		            }
		            else if(arr[i].charAt(j) == 't' && arr[i].charAt(j+1) == 'w') {
		                str += '2';
		                j+=2;
		            }
		            else if(arr[i].charAt(j) == 't' && arr[i].charAt(j+1) == 'h') {
		                str += '3';
		                j+=4;
		            }
		            else if(arr[i].charAt(j) == 'f' && arr[i].charAt(j+1) == 'o') {
		                str += '4';
		                j+=3;
		            }
		            else if(arr[i].charAt(j) == 'f' && arr[i].charAt(j+1) == 'i') {
		                str += '5';
		                j+=3;
		            }
		            else if(arr[i].charAt(j) == 's' && arr[i].charAt(j+1) == 'i') {
		                str += '6';
		                j+=2;
		            }
		            else if(arr[i].charAt(j) == 's' && arr[i].charAt(j+1) == 'e') {
		                str += '7';
		                j+=4;
		            }
		            else if(arr[i].charAt(j) == 'e') {
		                str += '8';
		                j += 4;
		            }
		            else if(arr[i].charAt(j) == 'n') {
		                str += '9';
		                j+=3;
		            }
		        }
		    }
		    sum += Integer.parseInt(str);
		}
		System.out.println(sum);
	}
}
