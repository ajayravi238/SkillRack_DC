import java.util.*;

public class ContainsConcatenatedWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        ArrayList<String> l = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(i != j) {
                    l.add(arr[i] + arr[j]);
                }
            }
        }
        int count = 0;
        for(int i=0; i<l.size(); i++) {
            for(int j=0; j<arr.length; j++) {
                if(l.get(i).equals(arr[j])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
