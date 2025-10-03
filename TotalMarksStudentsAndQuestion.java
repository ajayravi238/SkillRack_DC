import java.util.*;

public class TotalMarksStudentsAndQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] totalMarks = new int[N];
        int[] marks = new int[Q];
        for (int i = 0; i < Q; i++) {
            marks[i] = sc.nextInt();
        }
        boolean forward = true;
        int idx = 0;
        for (int i = 0; i < Q; i++) {
            totalMarks[idx] += marks[i];
            if (forward) {
                if (idx == N - 1) {
                    forward = false;
                    idx--;
                } else {
                    idx++;
                }
            } else {
                if (idx == 0) {
                    forward = true;
                    idx++;
                } else {
                    idx--;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(totalMarks[i]);
            if (i < N - 1) System.out.print(" ");
        }
    }
}
