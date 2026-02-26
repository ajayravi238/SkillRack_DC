import java.util.*;

public class SortBasedOnDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];
        for(int i=0; i<N; i++) {
            str[i] = sc.next();
        }
        Arrays.sort(str);
        for(int i=0; i<N; i++) {
            System.out.print(str[i] + " ");
        }
    }
}
