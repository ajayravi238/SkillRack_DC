import java.util.*;

public class RemoveReversedWords
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String word = sc.next();
        String[] arr = sentence.split(" ");
        StringBuilder reverse = new StringBuilder(word).reverse();
        for(int i=0; i<arr.length; i++) {
            if(!arr[i].equals(word) && !arr[i].equals(reverse.toString())) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
