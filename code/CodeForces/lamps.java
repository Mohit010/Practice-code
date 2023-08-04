import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int n = scanner.nextInt();
            PriorityQueue<Integer>[] q = new PriorityQueue[n + 1];

            for (int i = 1; i <= n; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if (q[x] == null) {
                    q[x] = new PriorityQueue<>();
                }
                q[x].add(y);
            }

            long res = 0;
            for (int i = 1; i <= n; i++) {
                int j = 0;
                while (q[i] != null && !q[i].isEmpty() && j < i) {
                    res += q[i].poll();
                    j++;
                }
            }

            System.out.println(res);
        }
    }
}

