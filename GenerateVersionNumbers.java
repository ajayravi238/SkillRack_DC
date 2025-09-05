import java.util.*;
public class GenerateVersionNumbers {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		ArrayList<String> com3 = new ArrayList<>();
		for(int i=X; i<=Y; i++) {
		    com3.add(String.valueOf(i));
		}
		ArrayList<String> com2 = new ArrayList<>();
		for(char i=ch1; i<=ch2; i++) {
		    com2.add(String.valueOf(i));
		}
		ArrayList<String> com1 = new ArrayList<>();
		for(int i=0; i<com2.size(); i++) {
		    for(int j=0; j<com3.size(); j++) {
		        com1.add(com2.get(i) + "" + com3.get(j));
		    }
		}
		for(int i=0; i<com1.size(); i++) {
		    for(int j=0; j<com2.size(); j++) {
		        for(int k=0; k<com3.size(); k++) {
		            System.out.println(com1.get(i) + "." + com2.get(j) + "." + com3.get(k));
		        }
		    }
		}
	}
}
